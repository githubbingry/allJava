// hilangkan package jika tidak membuka dari folder "PASD
package PASD.Selection;

import java.util.Scanner;

public class Program3_SwitchCase {
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
            switch ((A > B) && (A > C) ? '1'
            : (B > A) && (B > C) ? '2'
            : (C > B) && (C > A) ? '3' : '4') {
                case '1':
                    NilaiTerbesar = "A" ;
                    break;
                case '2':
                    NilaiTerbesar = "B" ;
                    break;
                case '3':
                    NilaiTerbesar = "C" ;
                    break;
                default:
                    NilaiTerbesar = "tidak ada, karena ada 2 atau 3 variabel yang memiliki nilai yang sama" ; 
                    break;
            }
            x.close();

            //Output
            System.out.println("Nilai terbesar dari ketiga nilai tersebut adalah " + NilaiTerbesar);
        } catch (Exception e) {
            // Display text ketika terjadi exception error
            System.out.println("Tolong hanya masukkan angka pada Variabel A, B, dan C!");
        }
    }
}
