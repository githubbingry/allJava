package Project_Euler;

import java.math.BigInteger;
import java.util.Scanner;

public class PE625 {
    public static void main(String[] args) {
        // not optimal, the sum method with time complexity of O(n*(n+1)/2) and gcd method time complexity O(log(n))
        Scanner x = new Scanner(System.in);
        // int n = x.nextInt();
        // System.out.println(sum(n));
        BigInteger N = new BigInteger(x.next());
        System.out.println(SUM(N));
        x.close();
    }

    static int gcd(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    static int sum(int n){
        int sum = 0;
        for (int j = 1; j <= n; j++){
            for(int i = 1; i <= j; i++){
                sum += gcd(i, j);
            }
        }
        return sum;
    }

    static BigInteger GCD(BigInteger a, BigInteger b){
        if (b.equals(BigInteger.ZERO))
            return a;
        else
            return GCD(b, a.mod(b));
    }

    static BigInteger SUM(BigInteger n){
        BigInteger sum = BigInteger.ZERO, mod = new BigInteger("998244353");
        for(BigInteger j = BigInteger.ONE; j.compareTo(n) <= 0; j = j.add(BigInteger.ONE)){
            for(BigInteger i = BigInteger.ONE; i.compareTo(j) <= 0; i = i.add(BigInteger.ONE)){
                sum = sum.add(GCD(i, j)).mod(mod);
            }
        }
        return sum;
    }
}
