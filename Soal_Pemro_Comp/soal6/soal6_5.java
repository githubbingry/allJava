package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), ar[] = new int[n];
        isiArr(x, ar);
        distinctNumber(ar);
        x.close();
    }

    static void isiArr(Scanner x, int[] ar){
        for (int i = 0; i < ar.length; i++){
            ar[i] = x.nextInt();
        }
    }

    static void distinctNumber(int[] ar){
        boolean beda = true;
        System.out.print(ar[0] + " ");
        for (int i = 1; i < ar.length; i++){
            beda = true;
            for (int j  = i; j > 0; j--){
                if (ar[i] == ar[j-1]) {
                    beda = false;
                    break;
                }
            }
            if (beda) System.out.print(ar[i] + " ");
        }
    }
}
