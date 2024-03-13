package coba;

import java.util.Scanner;

public class patternPiramid {
    // lanjutan patternSegitiga
    // pattern piramid dan kombinasinya
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("\nInput n baris : ");
        int n = x.nextInt();
        System.out.println("\nPilih A, B, C, D, E, F : ");
        char pattern = x.next().charAt(0);
        switch (pattern) {
            case 'A': PatternA(n);
                break;
            case 'B': PatternB(n);
                break;
            case 'C': PatternC(n);
                break;
            case 'D': PatternD(n);
                break;
            case 'E': PatternE(n);
                break;
            case 'F': PatternF(n);
                break;
            default: System.out.println("Tolong hanya input antara A, B, C, D, E, atau F");
        }
        x.close();
    }

    static void PatternA(int n){
        /*
         *      1
         *     2 1
         *    3 2 1
         *   4 3 2 1
         *  5 4 3 2 1
         * 6 5 4 3 2 1
         */
        for (int i=1; i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void PatternB(int n){
        /*
         *           1
         *         2 1 2
         *       3 2 1 2 3
         *     4 3 2 1 2 3 4
         *   5 4 3 2 1 2 3 4 5
         * 6 5 4 3 2 1 2 3 4 5 6
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void PatternC(int n){
        /*
         *  5 4 3 2 1 2 3 4 5
         *    4 3 2 1 2 3 4
         *      3 2 1 2 3
         *        2 1 2
         *          1
         */
        for (int i=n-1; i>=1;i--){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    static void PatternD(int n){
        /*
         *           1
         *         2 1 2
         *       3 2 1 2 3
         *     4 3 2 1 2 3 4
         *   5 4 3 2 1 2 3 4 5
         * 6 5 4 3 2 1 2 3 4 5 6
         *   5 4 3 2 1 2 3 4 5
         *     4 3 2 1 2 3 4
         *       3 2 1 2 3
         *         2 1 2
         *           1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i=n-1; i>=1;i--){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    static void PatternE(int n){
        /*
         *            1
         *          1 2 1
         *        1 2 3 2 1
         *      1 2 3 4 3 2 1
         *    1 2 3 4 5 4 3 2 1
         *  1 2 3 4 5 6 5 4 3 2 1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = i-1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void PatternF(int n){
        /*
         *                        1
         *                    1   2   1
         *                1   2   4   2   1
         *            1   2   4   8   4   2   1
         *        1   2   4   8  16   8   4   2   1
         *    1   2   4   8  16  32  16   8   4   2   1
         */
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
    }
}
