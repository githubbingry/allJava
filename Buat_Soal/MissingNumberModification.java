package Buat_Soal;

import java.util.Scanner;

public class MissingNumberModification {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        while(t-->0){
            int n = x.nextInt(), k = x.nextInt(), m = -1;
            int[] a = new int[n-k];
            for(int i = 0; i < a.length; i++){
                a[i] = x.nextInt();
                if(i == 0) m = a[i];
                else m = m < a[i] ? m : a[i];
            }
            int[] b = new int[n];
            for(int i = 0; i < a.length; i++){
                b[a[i]-m] = a[i];
            }
            for(int i = 0; i < b.length; i++){
                if(b[i] == 0) System.out.print((i+m) + " ");
                // System.out.print(b[i] + " ");
            }
        }
        x.close();
    }
}
