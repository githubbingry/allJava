package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(nReverse(n));
        x.close();
    }

    public static int digit(int n){
        int countDigit = 0, temp = n;
        do {
            countDigit++;
            temp /= 10;
        } while (temp != 0);
        return countDigit;
    }

    public static int nReverse(int n){
        int reverse = 0, temp = 0, i = 0, countDigit = digit(n);
        do {
            temp = n / (int)Math.pow(10, i++) % 10;
            reverse = temp + reverse * 10;
        } while (--countDigit != 0);
        return reverse;
    }
}
