package coba;

import java.util.Scanner;

public class detMatriks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong();
        long[][] ar = new long[(int) n ][(int) n];
        isiArr(x, ar);
        System.out.println(determinan(n, ar));
        printArr(ar);
        x.close();
    }

    public static void isiArr(Scanner x, long[][] ar){
        for (int i = 0; i < ar.length ;i++){
            for (int j = 0; j < ar.length; j++){
                ar[i][j] = x.nextLong();
            }
        }
    }

    public static long determinan(long n, long[][] ar){
        long sum = 0;
        if (n == 2) return ar[0][0]*ar[1][1] - ar[0][1]*ar[1][0];
        else if (n == 3){
            
        }
        return sum;
    }

    public static void printArr(long[][] ar){
        for (int i = 0; i < ar.length ;i++){
            for (int j = 0; j < ar.length; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
