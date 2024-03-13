// hilangkan package jika tidak membuka dari folder "PASD
package PASD.Selection;

import java.util.Scanner;

public class Program3_IfElse {
    public static void main(String[] args) {
        //Handling exception error
        try {
            //Input
            Scanner x = new Scanner(System.in);
                System.out.println("Masukkan Nilai A : ");
            double A = x.nextDouble();
                System.out.println("Masukkan Nilai B : ");
            double B = x.nextDouble();
                System.out.println("Masukkan Nilai C : ");
            double C = x.nextDouble();
            String NilaiTerbesar = "Nilai Terbesar" ;

            //Menjumlahkan ketiga nilai
            System.out.println("Jumlah ketiga nilai tersebut adalah " + (A + B + C));
            //Menentukan Nilai paling besar
            if ((A > B) && (A > C)) {
                NilaiTerbesar = "A" ;
            } else if ((B > A) && (B > C)) {
                NilaiTerbesar = "B" ;
            } else if ((C > B) && (C > A)) {
                NilaiTerbesar = "C" ;
            } else
                NilaiTerbesar = "tidak ada, karena ada 2 atau 3 variabel yang memiliki nilai yang sama" ;
            x.close();

            //Output
            System.out.println("Nilai terbesar dari ketiga nilai tersebut adalah " + NilaiTerbesar);
        } catch (Exception e) {
            // Display text ketika terjadi exception error
            System.out.println("Tolong hanya masukkan angka pada Variabel A, B, dan C!");
        }
    }
}
