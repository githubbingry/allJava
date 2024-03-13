package PASD.PRE_UAS;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ar[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                ar[i][j] = j+1;
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            for (int k = 0; k < i; k++){
                System.out.print("  ");
            }
            for (int j = n-1; j >= i; j--){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
/*
Program Pola
Deklarasi :
ar : array[n][n] of int
i, j, n : int
Algoritma:
read(n);
for(i <- 0; i < n; i++) do
    for (j <- 0; j < n; j++) do
        ar[i][j] = j + 1;
    end for
end for

for (i <- 0; i < n; i++)do
    for (j <- 0; j <= i; j++) do
        write(ar[i][j] + " ")
    end for
    writeln();
end for

1
1 2
1 2 3

array sebanyak n baris dan n kolom
buat pola seperti
n n-1 ... 2 1
  n-1 ... 2 1
      ... 2 1


misal n = 5
5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1

1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

ar[0][0] = 1, ar[0][1] = 2
        i = baris
        j = kolom
1 2 3
1 2 3
 */