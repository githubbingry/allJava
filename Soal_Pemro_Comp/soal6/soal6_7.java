package Soal_Pemro_Comp.soal6;

import java.util.Scanner;

public class soal6_7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), m = x.nextInt();
        int[] ar = new int[m];
        // isiDefaultArr(ar);
        int digit = digit(m);
        isiRandom(n, m, ar, digit);
        displayIsiArr(ar);
        x.close();
    }

    static int digit(int n){
        int countDigit = 0, temp = n;
        do {
            countDigit++;
            temp /= 10;
        } while (temp != 0);
        if (n % 10 == 0) countDigit--;
        return countDigit;
    }

    static void isiDefaultArr(int[] ar){ // tidak perlu karena ketika deklarasi int[] ar = new int[n] isinya sudah 0(nol) semua
        for (int i = 0; i < ar.length; i++){
            ar[i] = 0;
        }
    }

    static void isiRandom(int n, int m, int[] ar, int digit){
        int r = 1;
        for (int i = 0; i < n; i++){
            do{
                r = (int)(Math.random()*(int)Math.pow(10, digit));
            } while (r >= m);
            ar[r]++;
        }
    }

    static void displayIsiArr(int[] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
            System.out.printf("angka %d ada sebanyak %d, jumlah kumulatifnya %d\n", i, ar[i], sum);
        }
    }
}
