package Code_League.CL_8;

import java.util.Scanner;

public class NatanMatriks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), m = x.nextInt();
        if ((n < 1 || n > 100) ||(m < 1 || m > 100)) System.out.println("Ukuran tidak valid");
        else{
            int[][] ar = new int [n][m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    ar[i][j] = x.nextInt();
                }
            }
            for (int i = 0; i < n; i++){
                for (int j = m-1; j >= 0; j--){
                    System.out.print(ar[i][j] + " ");
                }
                System.out.println();
            }
        }
        x.close();
    }
}
