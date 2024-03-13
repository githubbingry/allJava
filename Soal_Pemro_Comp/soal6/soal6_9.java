package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        double ar[] = new double[n];
        isiAr(x, ar);
        System.out.println(min(ar));
        x.close();
    }

    static void isiAr(Scanner x ,double[] ar){
        for (int i = 0; i < ar.length; i++){
            ar[i] = x.nextDouble();
        }
    }

    public static double min(double[] array){
        double m = array[0];
        for (int i = 1; i < array.length; i++){
            m = m < array[i] ? m : array[i];
        }
        return m;
    }
}
