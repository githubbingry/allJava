package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_28 {
    public static void main(String[] args) { // maks 19(1) dan 7(2) sebelum akan memakan waktu yang lama
        Scanner x = new Scanner(System.in);
        System.out.print("Choose 1 for 'print prime until n' or 2 for 'print prime upto nth prime' : ");
        long choose = x.nextLong(), n; // 1 for soal5_28
        switch ((int)choose) {
            case 1:
                System.out.print("Input n : ");
                n = x.nextLong();
                dash();
                displayUntil_n(n);
                dash();
                break;
            case 2:
                System.out.print("Input n : ");
                n = x.nextLong();
                dash();
                displayUpTo_n(n);
                dash();
                break;
            default:
                System.out.println("Only choose between 1 or 2");;
        }
        x.close();
    }

    public static boolean isPrime(long n){
        if (n < 2) return false;
        for (long i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean isPalindrome(long n){
        String ns = Integer.toString((int)n);
        for (long i = 0; i < ns.length(); i++){
            long temp1 = n / (int)(Math.pow(10, i)) %10; // digit terakhir
            long temp2 = n / (int)(Math.pow(10, ns.length()-i-1)) %10; // digit awal
            if (temp1 != temp2) return false;
        }
        return true;
    }

    public static long digit(long n){
        long countDigit = 0, temp = n;
        do {
            countDigit++;
            temp /= 10;
        } while (temp != 0);
        return countDigit;
    }

    public static long Mersenne(long n){
        return (int)Math.pow(2, n) - 1;
    }

    public static void displayUntil_n(long n){ //print prime until n
        System.out.println("p \t 2^p - 1");
        dash();
        for (long i = 2; i <= n; i++){
            long MersennePrime = Mersenne(i);
            if (isPrime(i) && isPrime(MersennePrime))
                System.out.printf("%d\t%8d\n",i, MersennePrime);
        }
    }

    public static void displayUpTo_n(long n){
        long countNumber = 2;  // print prime up to nth prime
        System.out.println("p \t 2^p - 1");
        dash();
        do {
            long MersennePrime = Mersenne(countNumber);
            if (isPrime(countNumber) && isPrime(MersennePrime)){
                System.out.printf("%d\t%8d\n",countNumber, MersennePrime);
                n--;
            }
            countNumber++;
        } while (n != 0);
    }

    public static void dash(){
        System.out.println("-----------------");
    }
}
