package Soal_Pemro_Comp.soal14;

import java.util.Scanner;

public class soal14_2 {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        try {
            System.out.println(x.nextInt() + x.nextInt());
        } catch (Exception e) {
            main(args);
        }
        x.close();
    }
}
