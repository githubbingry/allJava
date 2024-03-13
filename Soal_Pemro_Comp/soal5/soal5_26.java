package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_26 {
    public static void main(String[] args) {
        // maks 98689(1) atau 113(2) sebelum akan memakan waktu yang lama -> method isPrime() memakai n/2
        // maks 9989899(1) atau 781(2) sebelum akan memakan waktu yang lama -> method isPrime() memakai sqrt(n)
        Scanner x = new Scanner(System.in);
        System.out.print("Choose 1 for 'print prime until n' or 2 for 'print prime upto nth prime' : ");
        long choose = x.nextLong(), n; // 2 for soal5_26
        switch ((int)choose) {
            case 1:
                System.out.print("Input n : ");
                n = x.nextLong();
                // long start = System.currentTimeMillis();
                displayUntil_n(n);
                // long duration = System.currentTimeMillis()-start;
                // System.out.println(duration+" ms");
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
        // if (n % (int)Math.sqrt(n) == 0 && n > 3) return false; // mempercepat waktu? nope
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

    public static void displayUntil_n(long n){
        long countNumber = 0;  //print prime until n
        for (long i = 2; i <= n; i++){
            if (isPrime(i) && isPalindrome(i)){
                System.out.print(i + " ");
                countNumber++;
                if (countNumber % 10 == 0) System.out.println();
            }
        }
    }

    public static void displayUpTo_n(long n){
        long countPrime = 0, countNumber = 2;;  // print prime up to nth prime
        do {
            if (isPrime(countNumber) && isPalindrome(countNumber)){
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
