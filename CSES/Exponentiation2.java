package CSES;

import java.util.Scanner;

public class Exponentiation2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), mod = (int)1e9 + 7;
        for (int i = 0; i < n; i++){
            long a = x.nextLong(), b = x.nextLong();
            long c = x.nextLong(), pow = exp(b, c, mod);
            System.out.println(exp(a, pow, mod));
        }
        x.close();
    }

    public static long exp(long a, long b, long mod){
        if(b == 0)
            return 1;
        else if (b % 2 == 0)
            return exp(a*a % mod, b/2, mod);
        else
            return a * exp(a*a, (b-1)/2, mod) % mod;
    }
}
