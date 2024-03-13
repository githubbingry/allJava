package CSES;

import java.util.Scanner;

public class IncreasingSubArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), max= 0, sum = 0;
        for (int i = 0; i < n; i++){
            long num = x.nextLong();
            max = (max > num) ? max : num;
            sum += max - num;
        }
        System.out.println(sum);
        x.close();
    }
}
