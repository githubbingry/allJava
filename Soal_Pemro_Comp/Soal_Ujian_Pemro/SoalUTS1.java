package Soal_Pemro_Comp.Soal_Ujian_Pemro;

import java.util.Scanner;

public class SoalUTS1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int bilangan = x.nextInt();
        int factor = 0;
        for (int i = 2; i<=bilangan; i++){
            if (bilangan%i==0)
                factor++;
            if (factor>1)
                break;
        }
        if (factor==1)
            System.out.println(bilangan + " adalah bilangan prima");
        else
            System.out.println(bilangan + " bukan bilangan prima");
        x.close();
    }
}
