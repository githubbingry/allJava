package coba;

import java.util.Scanner;

public class collatzConjecture {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong();
        do {
            System.out.print(n +" ");
            if (n % 2 ==0)
                n /= 2;
            else
                n = 3*n + 1;
        } while (n != 1);
        System.out.println(n);
        x.close();
    }
}
