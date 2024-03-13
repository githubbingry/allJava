// hilangkan package jika tidak membuka dari folder "PASD"
package PASD.Selection;

import java.util.Scanner;

public class Program1_IfElse {
    public static void main(String[] args) {
        //Handling exception error
        try {
            //Input
            Scanner x = new Scanner(System.in);
                System.out.println("Masukkan Nama Karyawan : ");
            String NamaKaryawan = x.next();
                System.out.println("Masukkan Gaji Pokok(dalam Rp.) : ");
            long GajiPokok = x.nextLong();
                System.out.println("Masukkan Lama Lembur(dalam Jam) : ");
            long LamaLembur = x.nextLong();

            //Menghitung Tunjangan Karyawan dari Gaji Pokok dan Lama Lembur
            double TunjanganKaryawan = GajiPokok * 0.2 ;
            if (LamaLembur < 1) {
                TunjanganKaryawan += LamaLembur * 0 ;
            } else if ((LamaLembur >= 1) && (LamaLembur < 10 )) {
                TunjanganKaryawan += LamaLembur * 1000 + 100000 ;
            } else if ((LamaLembur >= 10) && (LamaLembur < 20 )) {
                TunjanganKaryawan += LamaLembur * 1000 + 200000 ;
            } else if (LamaLembur >= 20)
                TunjanganKaryawan += LamaLembur * 1000 + 300000 ;
        
            //Menghitung Total Gaji
            double TotalGaji = GajiPokok + TunjanganKaryawan ;
            //Output
            System.out.println("Total gaji karyawan " + NamaKaryawan + " adalah Rp." + TotalGaji);
            x.close();
        } catch (Exception e) {
            // Display text ketika terjadi exception error
            System.out.println("Tolong hanya masukkan angka pada bagian Gaji Pokok dan Lama Lembur!");
        }
    }
}
