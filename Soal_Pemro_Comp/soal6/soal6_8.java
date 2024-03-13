package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), ar[] = new int[n];
        isiAr(x, ar);
        System.out.println(averageInt(ar));
        System.out.println(averageDouble(ar));
        x.close();
    }

    static void isiAr(Scanner x ,int[] ar){
        for (int i = 0; i < ar.length; i++){
            ar[i] = x.nextInt();
        }
    }

    public static int averageInt(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double averageDouble(int[] array){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
}
// 0123 0132 0312 3012 3021 3201 23