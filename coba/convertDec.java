package coba;

import java.util.Scanner;

public class convertDec {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), b = x.nextLong();
        
        // radix are in interval of 0 to 36
        // 0123456789abcdefghijklmnopqrstuvwxyz
        System.out.println(n);
        System.out.println("Binary : "+Integer.toString((int)n,2)); //dec to bin
        System.out.println("Octal : "+Integer.toString((int)n,8)); //dec to oct
        System.out.println("Hex : "+Integer.toString((int)n,16)); //dec to hex
        System.out.println("Custom base "+b+" : "+Integer.toString((int)n,(int)b));

        for (int i = 31; i >= 0; i--) { // maks 32, dec to bin
            int k = (int)n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
        x.close();
    }
}
