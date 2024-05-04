package Buat_Soal;

import java.math.BigInteger;
import java.util.Scanner;

/*
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

public class AlternatingSequence {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt(); // banyak tc
        while(t-->0){
            int n = x.nextInt(); // banyak angka alternating
            String m = x.next(); // banyak loop
            // System.out.println(sum(x, n, m));
            System.out.println(sumBI(x, n, m));
        }
        x.close();
    }

    static int sum(Scanner x, int n, String m){
        int sum = 0;
        int[] a = new int[n];
        int[] k = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = x.nextInt(); //input angka alternating
            k[i] = (Integer.parseInt(m) + n - i - 1)/n; //perwakilan angka alternating untuk rumus umum
            sum += a[i]*k[i]*(k[i]+1)/2; //rumus umum sum sampe ke m di modifikasi untuk angka alternating
        }
        return sum;
    }

    static BigInteger sumBI(Scanner x, int n, String m){
        BigInteger nol = BigInteger.ZERO, satu = BigInteger.ONE, dua= BigInteger.TWO, N = BigInteger.valueOf(n), M = new BigInteger(m);
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
}
