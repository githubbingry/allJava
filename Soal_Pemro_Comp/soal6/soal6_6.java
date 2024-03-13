package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(isPrime1(n));
        x.close();
    }

    public static boolean isPrime1(int number){ // lebiih cepat
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++)
            if (number % divisor == 0)
                return false;
        if (number < 2)
            return false;
        return true;
    }
}
