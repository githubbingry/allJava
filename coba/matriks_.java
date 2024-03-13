package coba;

import java.util.Scanner;

public class matriks_ {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("ordo n x n");
        int n = x.nextInt();
        int[][] matriks = new int[n][n];
        isi(n, matriks, x);
        tampil(n, matriks);
        if (n==2)
            System.out.println("hasil determinan : "+det2(n, matriks));
        x.close();
    }

    static void isi(int n,int[][] matriks, Scanner x){
        System.out.println("masukkan elemen");
        for (int i = 0 ; i<n ; i++){
            for (int j =0 ; j<n; j++){
                matriks[i][j] = x.nextInt();
            }
        }
    }

    static void tampil(int n,int[][] matriks){
        System.out.println("bentuk matriks");
        for (int i = 0 ; i<n ; i++){
            for (int j =0 ; j<n; j++){
                if (j == 0)
                    System.out.print("| ");
                System.out.print(matriks[i][j]+" ");
                if (j==n-1)
                    System.out.print("|");
            }
            System.out.println();
        }
    }
    
    static int det2(int n,int[][] matriks){
        // int result = matriks[0][0]*matriks[1][1] - matriks[0][1]*matriks[1][0];
        int result1 = 1;
        int result2 = 1;

        for (int i = 0 ; i<n ; i++){
            for (int j =0 ; j<n; j++){
                if (i==j)
                    result1 *= matriks[i][j];
                else
                    result2 *= matriks[i][j];
            }
        }
        return result1 - result2;
    }

    static int det3(int n, int[][] matriks){
        return 0;
    }
}
