package Soal_Pemro_Comp.soal14;

import java.util.Scanner;

public class soal14_3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] a = new int[100];
        for(int i = 0; i < 100; a[i++] = (int)(Math.random()*100)+1);
        try {
            System.out.println(a[x.nextInt()]);
        } catch (Exception e) {
            System.out.println("Out of Bounds");
        }
        x.close();
    }
}
