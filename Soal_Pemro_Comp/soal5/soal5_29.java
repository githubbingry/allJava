package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_29 {
    public static void main(String[] args) { // maks unknown
        Scanner x = new Scanner(System.in);
        System.out.print("Choose 1 for 'print prime until n' or 2 for 'print prime upto nth prime' : ");
        long choose = x.nextLong(), n; // 2 for soal5_29
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

    public static void displayUntil_n(long n){ //print prime until n
        for (long i = 2; i <= n; i++)
            if (isPrime(i) && isPrime(i + 2))
                System.out.printf("(%d, %d)\n",i, i + 2);
    }

    public static void displayUpTo_n(long n){
        long countNumber = 2;  // print prime up to nth prime
        do {
            if (isPrime(countNumber) && isPrime(countNumber + 2)){
                System.out.printf("(%d, %d)\n",countNumber, countNumber + 2);
                n--;
            }
            countNumber++;
        } while (n != 0);
    }
}
