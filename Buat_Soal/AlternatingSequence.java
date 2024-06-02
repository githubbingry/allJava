package Buat_Soal;

import java.math.BigInteger;
import java.util.Scanner;

/*
n = 2, m = 10
a1 = 100, a2 = -123

100 + (-123) + 2(100) + 2(-123) + ...

modifikasi dari ini
f(x) = {
    a*x, if x is odd
    b*x, if x is even
}
sum from i = 1 to n of f(i)
for all n ∈ N and a, b ∈ Z

Solution :
o = floor((n+1)/2)
e = floor(n/2)
sum = a*o*(o+1)/2 + b*e*(e+1)/2
 */

/*
PROBELM STATEMENT
AKRAM diberi pr oleh pak sam untuk menentukan hasil penjumlahan dari suatu barisan aritmetika dari suku pertama sampai suku ke m
akan tetapi terdapat


INPUT FORMAT
Baris pertama berisi satu bilangan bulat t - banyak test case
Baris kedua berisi 2 bilangan yaitu n dan m - n yaitu banyak bilangan yang menjadi basis penjumlahan, dan m adalah banyak suku yang ingin dijumlahkan
Baris ketiga berisi n bilangan ai - basis ke i

CONSTRAINT
0 < t <= 10
0 < n <= m <= 10^3
|a_i| <= 10^3, i = {1, 2, 3, ..., n}

OUTPUT FORMAT
Untuk setiap uji kasus cetak satu bilangan bulat - hasil penjumlahan dari semua suku deret aritmetika

SAMPLE INPUT 0
2
2 10
3 5
3 100
1 2 -3

SAMPLE OUTPUT 0
120
34

PENJELASAN SAMPLE 0
Pada baris pertama t = 2, menandakan ada 2 test case

Untuk test case 1 :
Input :
n = 2, menandakan ada 2 bilangan yang menjadi basis
m = 10,menandakan ada 10 suku yang harus dijumlahkan
a1 = 3, a2 = 5, menjadi basis dari deret aritmetika
Output :
maka deret yang dihasilkan adalah 3, 5, 6, 10, 9, 15, 12, 20, 15, 25.
hasil penjumlahan deret tersebut yaitu 3 + 5 + 6 + 10 + 9 + 15 + 12 + 20 + 15 + 25 = 120

Untuk test case 2 :
Input :
n = 3, menandakan ada 3 bilangan yang menjadi basis
m = 100, menandakan ada 100 suku yang harus dijumlahkan
a1 = 1, a2 = 2, a3 = -3, menjadi basis dari deret aritmetika
Output :
maka deret yang dihasilkan adalah 1, 2, -3, 2, 4, -6, 3, 6, -9, ..., 66, -99, 34
hasil penjumlahan deret tersebut yaitu 1 + 2 - 3 + 2 + 4 - 6 + 3 + 6 - 9 + ... + 66 - 99 + 34 = 34
*/
public class AlternatingSequence {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt(); // banyak tc
        while(t-->0){
            int n = x.nextInt(); // banyak angka alternating
            BigInteger m = new BigInteger(x.next()); // banyak loop
            // System.out.println(sum(x, n, m)); //for int
            System.out.println(sumBI(x, n, m)); //for big integer
            // System.out.println(bruteForce(x, n, m)); //bruteforcing loop
        }
        x.close();
    }

    /*
    Time Complexity of O(m) which is lot bigger than O(n)
    Space Complexity of O(n)
     */
    static int bruteForce(Scanner x, int n, BigInteger m){
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0, j = 1; i < Integer.parseInt(m.toString()); i++){
            if (i < n) a[i] = x.nextInt();
            sum += j*a[(i)%n];
            if((i+1)%n==0) j++;
        }
        return sum;
    }

    /*
    Time Complexity of O(n)
    Space Complexity of O(n)
     */
    static int sum(Scanner x, int n, BigInteger m){
        int sum = 0;
        int[] a = new int[n];
        int[] k = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = x.nextInt(); //input angka alternating
            k[i] = (Integer.parseInt(m.toString()) + n - i - 1)/n; //perwakilan angka alternating untuk rumus umum
            sum += a[i]*k[i]*(k[i]+1)/2; //rumus umum sum sampe ke m di modifikasi untuk angka alternating
        }
        return sum;
    }

    /*
    Time Complexity of O(n)
    Space Complexity of O(1)
     */
    static int sum2(Scanner x, int n, BigInteger m){
        int sum = 0;
        int a, k;
        for(int i = 0; i < n; i++){
            a = x.nextInt(); //input angka alternating
            k = (Integer.parseInt(m.toString()) + n - i - 1)/n; //perwakilan angka alternating untuk rumus umum
            sum += a*k*(k+1)/2; //rumus umum sum sampe ke m di modifikasi untuk angka alternating
        }
        return sum;
    }

    /*
    Time Complexity of O(n)
    Space Complexity of O(n)
     */
    static BigInteger sumBI(Scanner x, int n, BigInteger m){
        BigInteger nol = BigInteger.ZERO, satu = BigInteger.ONE, dua= BigInteger.TWO, N = BigInteger.valueOf(n), M = m;
        BigInteger sum = nol;
        BigInteger[] a = new BigInteger[n];
        BigInteger[] k = new BigInteger[n];
        for(BigInteger i = nol; i.compareTo(N) < 0; i = i.add(satu)){
            a[i.intValue()] = new BigInteger(x.next());
            k[i.intValue()] = M.add(N).subtract(i).subtract(satu).divide(N);
            sum = sum.add(a[i.intValue()].multiply(k[i.intValue()]).multiply(k[i.intValue()].add(satu)).divide(dua));
            // System.out.println(sum); //of course this isn't readable(readable if u focus enough :v)
        }
        return sum;
    }

    /*
    Time Complexity of O(n)
    Space Complexity of O(1)
     */
    static BigInteger sumBI2(Scanner x, int n, BigInteger m){
        BigInteger nol = BigInteger.ZERO, satu = BigInteger.ONE, dua= BigInteger.TWO, N = BigInteger.valueOf(n), M = m;
        BigInteger sum = nol;
        BigInteger a, k;
        for(BigInteger i = nol; i.compareTo(N) < 0; i = i.add(satu)){
            a = new BigInteger(x.next());
            k = M.add(N).subtract(i).subtract(satu).divide(N);
            sum = sum.add(a.multiply(k).multiply(k.add(satu)).divide(dua));
            // System.out.println(sum); //of course this isn't readable(readable if u focus enough :v)
        }
        return sum;
    }
}
