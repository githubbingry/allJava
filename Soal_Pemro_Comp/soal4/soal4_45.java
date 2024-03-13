package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_45 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), count = 0;
        for (int i = 1; i <= n; i++){
            for (int j = i + 1; j <= n; j++){
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count); //21

        count = 0;
        for (int i = 1; i <= n; i++){
            for (int j = i; j <= n; j++){
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count); //28

        count = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count); //49
        x.close();
    }
}
