package CSES;

import java.util.Scanner;

public class XORPiramid {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), temp = 0, var, m = n;
        long[] ar = new long[(int) n];
        for (int i = 0; i < n; i++){
            ar[i] = x.nextInt();
        }
        for (int j=0; j<n; j++){
            for (int i=0; i<m; i++){
                if (i==0) temp = ar[i];
                else {
                    var = temp ^ ar[i];
                    temp = ar[i];
                    ar[i-1] =var;
                }
            }
            m--;
        }
        System.out.println(ar[0]);
        x.close();
    }
}
