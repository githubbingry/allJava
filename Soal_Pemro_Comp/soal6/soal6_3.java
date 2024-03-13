package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n, ar[] = new int[100];
        do{
            n = x.nextInt();
            // n = (int)(Math.random()*100);
            ar[n]++;
        } while (n != 0);
        for (int i = 1; i < 100; i++){
            if (ar[i] != 0)
            System.out.println("Angka "+ (i) +" ada sebanyak "+ ar[i]);
        }
        x.close();
    }
}
