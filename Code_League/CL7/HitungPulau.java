package Code_League.CL7;

import java.util.Scanner;

public class HitungPulau {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[][] pulau = new int[5][4];
        int count = 1;
        //int temp = -1;
        for (int i = 0; i < 5; i++){
            for(int j = 0; j< 4; j++){
                pulau[i][j] = x.nextInt();
            }
        }
        x.close();
        for (int i = 1; i < 5; i++){
            for(int j = 0; j< 4; j++){
                
            }
        }
        System.out.println(count);
    }
}