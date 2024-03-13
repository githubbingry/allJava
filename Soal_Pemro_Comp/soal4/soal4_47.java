package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_47 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter how much numbers : ");
        int n = x.nextInt();
        double a, sum = 0, deviation, sumSquared = 0;
        System.out.print("Enter the numbers : ");
        for (int i = 0; i < n; i++){
            a = x.nextDouble();
            sumSquared += a * a;
            sum += a;
        }
        System.out.printf("The mean is %.2f\n", sum / n);
        sum = (sum * sum) / n;
        deviation = Math.sqrt((sumSquared - sum) / (n - 1));
        System.out.printf("The standard deviation is %.5f", deviation);
        x.close();
    }
}
