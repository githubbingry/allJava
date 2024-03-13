package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_2{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++){
            a[i] = x.nextInt();
        }
        for (int i = 9; i >= 0; i--){
            System.out.print(a[i]+ " ");
        }
        x.close();
    }
}