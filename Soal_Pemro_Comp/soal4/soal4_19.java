package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_19 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                int p = j;
                p = (int)Math.pow(2,j-1);
                System.out.print(p < 10 ? "   "+p : (p < 100) ? "  "+p : (p < 1000) ? " "+p : p);
            }
            for (int k = i-1; k >= 1; k--) {
                int p = k;
                p = (int)Math.pow(2,k-1);
                System.out.print(p < 10 ? "   "+p : (p < 100) ? "  "+p : (p < 1000) ? " "+p : p);
            }
            System.out.println();
        }
        x.close();
    }
}
