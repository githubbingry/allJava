package CSES;

import java.util.Scanner;

public class PrimeMultiples {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), k = x.nextInt();
        boolean[] a = new boolean[n];
        for(int i = 0; i < k; i++){
            cek(x.nextInt(), a);
        }
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]) count++;
            // System.out.print(a[i] + "" + (i+1) + " ");
        }
        System.out.println(count);
        x.close();
    }

    static void cek(int p, boolean[] a){
        int t = p;
        for(; p <= a.length; p += t){
            a[p-1] = true;
            // System.out.print(p + " ");
        }
    }
}
