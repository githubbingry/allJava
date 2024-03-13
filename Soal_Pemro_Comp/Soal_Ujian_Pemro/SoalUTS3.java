package Soal_Pemro_Comp.Soal_Ujian_Pemro;

import java.util.Scanner;

public class SoalUTS3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan jumlah uang ");
        int uang = x.nextInt();
        int sisa = uang;
        int pec100 = sisa /100; sisa %= 100;
        int pec50 = sisa /50; sisa %= 50;
        int pec20 = sisa /20; sisa %= 20;
        int pec10 = sisa /10; sisa %= 10;
        int pec5 = sisa /5;
        System.out.println("Hasil penukaran "+uang+"\n"+
                            "Jumlah pecahan 100 "+pec100+" lembar\n"+
                            "Jumlah pecahan 50 "+pec50+" lembar\n"+
                            "Jumlah pecahan 20 "+pec20+" lembar\n"+
                            "Jumlah pecahan 10 "+pec10+" lembar\n"+
                            "Jumlah pecahan 5 "+pec5+" lembar");
        x.close();
    }
}
