package Soal_Pemro_Comp.Soal_Ujian_Pemro;

import java.util.Scanner;

public class SoalQuiz1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan titik : ");
        double x1 = x.nextDouble(), y1 = x.nextDouble();
        double xy = Math.pow(x1, 2)+Math.pow(y1, 2);
        if (xy <= 100) System.out.printf("Point(%.2f,%.2f) di dalam lingkaran", x1, y1);
        else System.out.printf("Point(%.2f,%.2f) tidak di dalam lingkaran", x1, y1);
        x.close();
    }
}
