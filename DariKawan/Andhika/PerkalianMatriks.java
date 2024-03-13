package DariKawan.Andhika;

import java.util.Scanner;

public class PerkalianMatriks {

	public static int[][] array1(Scanner x, int n, int m){
        System.out.println("input elemen matriks pertama");
		int ar[][] = new int[n][m];
		for(int i = 0; i< ar.length; i++) {
			for(int j = 0; j< ar[i].length; j++) {
				ar[i][j] = x.nextInt();
			}
		}
		return ar;
	}
	
	public static int[][] array2 (Scanner x, int p, int q){
        System.out.println("input elemen matriks kedua");
		int br[][] = new int[p][q];
		for(int i = 0; i< br.length; i++) {
			for(int j = 0; j< br[i].length; j++) {
				br[i][j] = x.nextInt();
			}
		}
		return br;
	}
	
	public static void kaliArray1(int[][] a, int[][] b, int n, int q) {
		int c[][] = new int[n][q];
		for(int i = 0; i< a.length; i++) {
			for(int j = 0; j< b[i].length; j++) {
				c[i][j] = 0;
				for(int k = 0; k < a[i].length; k++) {
					c[i][j] += (a[i][k]*b[k][j]);
				}
                if (j == 0)
                    System.out.print("| ");
				System.out.print(c[i][j] + " ");
                if (j==b[i].length-1)
                    System.out.print("|");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("input ordo matriks pertama");
        int n = x.nextInt();
        int m = x.nextInt();
        System.out.println("input ordo matriks kedua");
        int p = x.nextInt();
        int q = x.nextInt();
        
        if (m != p)
            System.out.println("tidak bisa mengalikan matriks jika kolom pertama tidak sama dengan baris pertama");
        else {
		int a[][] = new int[n][m];
		int b[][] = new int[p][q];
		
		a = array1(x,n,m);
		b = array2(x,p,q);
        
        System.out.println("hasil perkalian matriks");
		kaliArray1(a,b,n,q);
        x.close();
        }
	}
}
