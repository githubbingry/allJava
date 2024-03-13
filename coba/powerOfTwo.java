package coba;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong();
        System.out.println(isThePowerOfTwo(n));
        x.close();
    }

    static boolean isThePowerOfTwo(long n){
        if (n < 2) return false;
        return  (n & (n-1)) == 0;
    }
}
