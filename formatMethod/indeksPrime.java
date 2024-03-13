package formatMethod;

import java.util.Scanner;

public class indeksPrime {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), count = 0;
        if (isPrime(n)){
            for (long i = n; i >= 2; i--){
                if (isPrime(i)){
                    count++;
                }
            }
            System.out.println(count);
        } else
            System.out.println("bukan prime");
        x.close();
    }

    static boolean isPrime(long n){
        if (n < 2) return false;
        for (long i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
