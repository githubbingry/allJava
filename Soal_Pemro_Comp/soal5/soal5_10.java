package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        boolean memoIsPrime = isPrime1(number);
        System.out.println(memoIsPrime);
        System.out.println(isPrime2(number));
        displayPrime(number);
        x.close();
    }
    public static boolean isPrime1(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++)
            if (number % divisor == 0)
                return false;
        if (number < 2)
            return false;
        return true;
    }

    public static boolean isPrime2(int number){
        int factor = 0;
        for (int i = 2; i<=number; i++)
            if (number%i==0)
                factor++;
        if (factor != 1)
            return false;
        return true;
    }

    public static void displayPrime(int number){
        for (int i = 2; i <= number; i++)
            if (isPrime1(i)/* && isPrime2(i) */)
                System.out.print(i + " ");
    }
}
