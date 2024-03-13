package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), ar[] = new int[n], maks = 0;
        for (int i = 0; i < n; i++){
            ar[i] = x.nextInt();
            maks = (maks > ar[i]) ? maks : ar[i];
        }
        for (int i = 0; i < n; i++){
            if (ar[i] >= maks - 10) println("Student "+ (i+1) +" got A");
            else if (ar[i] >= maks - 20) println("Student "+ (i+1) +" got B");
            else if (ar[i] >= maks - 30) println("Student "+ (i+1) +" got C");
            else if (ar[i] >= maks - 40) println("Student "+ (i+1) +" got D");
            else println("Student "+ (i+1) +" got E");
        }
        x.close();
    }

    static void println(String s){System.out.println(s);}
    static void print(String s){System.out.print(s);}
}
