package Soal_Pemro_Comp.Soal_Ujian_Pemro.SoalQuiz2;

import java.util.Scanner;

public class testPersamaanKuadrat {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        PersamaanKuadrat udin = new PersamaanKuadrat(x.nextDouble(), x.nextDouble(), x.nextDouble());
        if (udin.getDiscriminant() > 0){
            System.out.println("hasil akar adalah "+udin.getRoot1()+" dan "+udin.getRoot2());
        } else if (udin.getDiscriminant() == 0) {
            System.out.println("hasil akar adalah "+udin.getRoot1());
        } else {
            System.out.println("Persamaan tidak memiliki akar");
        }
        x.close();
    }
}
// ax^2 + bx + c
/*
a = 0
bx + c = 0
x = -c/b
 */