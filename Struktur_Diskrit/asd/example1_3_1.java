package Struktur_Diskrit.asd;

import java.util.Scanner;

public class example1_3_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt(), b = x.nextInt(), answer = a;
        for (int i = 1; i < b; i++){
            answer *= a;
        }
        System.out.println(answer);
        x.close();
    }
}
