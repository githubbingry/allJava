package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        displayPattern(n);
        x.close();
    }

    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++){ //baris
            for (int j = i; j < n; j++){ // whitespace
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--){ //angka dari baris sampai 1
                System.out.print(" "+ j);
                // atau pke ini System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
