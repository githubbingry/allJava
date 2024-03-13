package formatMethod;

import java.util.Scanner;

public class checkDigit {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(digit(n));
        x.close();
    }

    public static long digit(long n){
        long countDigit = 0, temp = n;
        do {
            countDigit++;
            temp /= 10;
        } while (temp != 0);
        return countDigit;
    }
}

