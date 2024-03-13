package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_26 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double n = x.nextDouble(), sum = 0, factorial = 1, temp = n;
        for (long j = 0; j <= 10; j++){
            n = temp + j * 10000;
            System.out.println("untuk n = " + n);
            for (long i = 0; i <= n; i++){
                if (i == 0)
                    factorial *= i + 1;
                else
                    factorial *= i;
                sum += 1/factorial;
            }
            System.out.println(sum);
            sum = 0;
            factorial = 1;
        }
        x.close();
    }
}
