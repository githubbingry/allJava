package DariKawan.Andhika;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner deez = new Scanner(System.in);
        int n = deez.nextInt();
		deez.close();
		String arr[][] = new String[n][2*n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n; j++) {
				arr[i][j] = "* ";
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--){
				System.out.print("  ");
			}
			for (int j = 0; j <= i*2; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
    }
}

/*
Program pattern
Deklarasi :
i, j, n : int
ar : array[n][n] of int
Algoritma :
for (i <- 0; i < n; i++) {
	for (j <- 0; j <= i; j++) {
		arr[i][j] <- j + 1;
	}
}
for (i <- 0; i < n; i++) {
	for ( j <- 0; j <= i; j++) {
		write(arr[i][j] + " ");
	}
	writeln();
}
 */
