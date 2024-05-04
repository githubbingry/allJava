package IFFEST.Final2024;

import java.util.Scanner;

public class Kontainer {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        // int e = x.nextInt();
        int[] a = new int[n];
        int max = isi1(a, x);
        System.out.println(max);
        x.close();
    }
    static int isi1(int[] A, Scanner x){
        int max = x.nextInt();
        for(int i = 1; i < A.length; i++){
            A[i] = x.nextInt();
            max = max > A[i] ? max : A[i];
        }
        return max;
    }
}
