package Struktur_Diskrit.asd;

import java.util.Scanner;

public class example1_2_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++){
            ar[i] = x.nextInt();
        }
        int min = ar[0];
        for (int i = 1; i < n; i++){
            if (ar[i] < min){
                min = ar[i];
            }
        }
        System.out.println(min);
        x.close();
    }
}
