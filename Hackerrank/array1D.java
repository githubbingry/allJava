package Hackerrank;

import java.util.Scanner;

public class array1D {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++){
            ar[i] = x.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.println(ar[i]);
        }
        x.close();
    }
}
