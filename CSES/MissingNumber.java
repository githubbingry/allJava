package CSES;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), temp = 0;
        int[] ar = new int[n-1];
        for (int i = 0; i < ar.length; i++){
            ar[i] = x.nextInt();
        }
        x.close();
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++){
            temp = ar[i];
            if (i+1 != temp && temp != ar[i]+1){
                System.out.println(i+1);
                return;
            }
        }
    }
}