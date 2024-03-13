package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_27 {
    public static void main(String[] args) { // maks unknown
        Scanner x = new Scanner(System.in);
        System.out.print("Note : its only start from 13\nChoose 1 for 'print prime until n' or 2 for 'print prime upto nth prime' : ");
        long choose = x.nextLong(), n; // 2 for soal5_27
        switch ((int)choose) {
            case 1:
                System.out.print("Input n : ");
                n = x.nextLong();
                displayUntil_n(n);
                break;
            case 2:
                System.out.print("Input n : ");
                n = x.nextLong();
                displayUpTo_n(n);
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

    public static long nReverse(long n){
        long reverse = 0, temp = 0, i = 0, countDigit = digit(n);
        do {
            temp = n / (int)Math.pow(10, i++) % 10;
            reverse = temp + reverse * 10;
        } while (--countDigit != 0);
        return reverse;
    }

    public static void displayUntil_n(long n){
        long countNumber = 0;  //print prime until n
        for (long i = 2; i <= n; i++){
            if (isPrime(i) && isPrime(nReverse(i)) && !isPalindrome(i)){
                System.out.print(i + " ");
                countNumber++;
                if (countNumber % 10 == 0) System.out.println();
            }
        }
    }

    public static void displayUpTo_n(long n){
        long countPrime = 0, countNumber = 11;  // print prime up to nth prime
        do {
            if (isPrime(countNumber) && isPrime(nReverse(countNumber)) && !isPalindrome(countNumber)){
                System.out.print(countNumber + " ");
                countPrime++;
                n--;
                if (countPrime % 10 == 0){
                    System.out.println();
                    countPrime = 0;
                }
            }
            countNumber++;
        } while (n != 0);
    }
}
