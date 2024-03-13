package CSES;

import java.util.Scanner;

public class MinimumEuclideanDistance {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextInt(), d = 0, min = 0;
        long[][] ar = new long[(int)n][2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                ar[i][j] = x.nextLong();
            }
        }
        for (int i = 0; i < n-1; i++){
            for (int j = i; j < n -1; j++){
                if (i == 0 && j == 0){
                    d = (int)Math.pow(ar[i][0] - ar[j+1][0], 2) + (int)Math.pow(ar[i][1] - ar[j+1][1], 2);
                    min = d;
                } else {
                    d = (int)Math.pow(ar[i][0] - ar[j+1][0], 2) + (int)Math.pow(ar[i][1] - ar[j+1][1], 2);
                    min = (min < d) ? min : d;
                }
            }
        }
        System.out.println(min);
        x.close();
    }
}
