package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_22 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Long n = x.nextLong();
        System.out.printf("Hasil akar dari %d adalah %5.10f", n, sqrt(n));
        x.close();
    }
    public static double sqrt(long n){
        double nextGuess = 0, lastGuess = 1000000000000l, difference = 0;
        do {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            difference = lastGuess - nextGuess;
            lastGuess = nextGuess;
        } while (difference > 0.000000001);
        return nextGuess;
    }
}
