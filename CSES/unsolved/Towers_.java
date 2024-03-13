package CSES.unsolved;

import java.util.Scanner;

public class Towers_ {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), maks = 0, count = 1;
        long[] ar = new long[(int) n];
        for (int i = 0; i < n; i++){
            ar[i] = x.nextLong();

            /*
            if (i == 0) {
                temp = ar[i];
                count++;
            } else if (temp <= ar[i]){
                temp = ar[i];
                count++;
            }
             */

            if (i == 0)
                maks = ar[i];
            else if (ar[i] >= maks){
                if((ar[i] >= ar[i-1]) && (ar[i] >= maks))
                    count++;
                if (ar[i] == 1)
                maks = ar[i];
            }
        }
        System.out.println(count);
        x.close();
    }
}
