package Code_League.CL_1_2024;

import java.util.Scanner;

public class HitungPulau {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        int[][] a = new int[4][5];
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                a[i][j] = x.nextInt();
            }
        }
        // int n = 0;
        x.close();
    }
}
