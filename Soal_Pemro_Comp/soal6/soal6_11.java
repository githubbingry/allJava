package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        double ar[] = new double[n];
        isiAr(x, ar);
        display(ar);
    }

    static void isiAr(Scanner x ,double[] ar){
        for (int i = 0; i < ar.length; i++){
            ar[i] = x.nextDouble();
        }
    }

    static double mean(double[] ar){
        double sum = 0.0;
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum / ar.length;
    }

    static double deviation(double[] ar){
        double sum = 0.0, mean = mean(ar);
        for (int i = 0; i < ar.length; i++){
            sum += Math.pow(ar[i] - mean, 2);
        }
        System.out.printf("%.2f\n",mean);
        return Math.sqrt(sum / (ar.length - 1));
    }

    static void display(double[] ar){
        System.out.printf("%.5f",deviation(ar));
    }
}
