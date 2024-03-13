package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_41 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int max = 0, min = 0, countMax = 0, countMin = 0, n;
        do {
            n = x.nextInt();
            if (n == 0) break;
            if (max < n){
                max = n;
                countMax = 1;
            } else if (max == n)
                countMax++;
            if (min > n){
                min = n;
                countMin = 1;
            } else if (min == n)
                countMin++;
        } while (n != 0);
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);
        System.out.println("The occurance count of the largest number is " + countMax);
        System.out.println("The occurance count of the smallest number is " + countMin);
        x.close();
    }
}
