package Probabilitas_Statistika;

import java.util.Scanner;

public class SimpanganTengah {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), ar[] = new int[n];
        inputArray(ar, x);
        System.out.println("nilai tengah : "+mean(ar));
        System.out.println("simpangan tengah : "+simpanganTengah(ar));
        x.close();
    }

    static void inputArray(int[] ar, Scanner x){
        for (int i = 0; i < ar.length; i++){
            ar[i] = x.nextInt();
        }
    }

    static double mean(int[] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return (double)sum/ar.length;
    }

    static double simpanganTengah(int[] ar){
        double mean = mean(ar), range, sum = 0;
        for (int i = 0; i < ar.length; i++){
            range = Math.abs(ar[i] - mean);
            sum += range;
        }
        return sum/ar.length;
    }
}
