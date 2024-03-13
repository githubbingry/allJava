package Soal_Pemro_Comp.Soal_Ujian_Pemro;

import java.util.Scanner;

public class SoalUTS2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num, max = -1, count = 0;
        do {
            num = x.nextInt();
            if (max == num)
                count++;
            else if (max<num){
                max = num;
                count = 1;
            }
        } while (num != 0);
        System.out.println("Nilai terbesar "+max);
        System.out.println("Jumlah kemunculan "+count);
        x.close();
    }
}
