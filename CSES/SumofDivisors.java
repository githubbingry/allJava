package CSES;

import java.util.Scanner;

public class SumofDivisors {
    public static void main(String[] args) { // O(n^2)
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), mod = (int)(1e9 + 7), sum = 0;
        for (long i = 1; i <= n; i++)
            sum += countDiv(i);
        System.out.println(sum % mod);
        x.close();
    }

    public static long countDiv(long n){
        long sum = 0;
        for (long i = 1; i <= n; i++)
            if (n % i == 0) sum += i;
        return sum;
    }
}
