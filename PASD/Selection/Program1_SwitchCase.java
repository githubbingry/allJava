// hilangkan package jika tidak membuka dari folder "PASD"
package PASD.Selection;

import java.util.Scanner;

public class Program1_SwitchCase {
    public static void main(String[] args) {
        //Handling exception error
        try {
            //Input
            Scanner x = new Scanner(System.in);
                System.out.println("Masukkan nama karyawan : ");
            String NamaKaryawan = x.next();
                System.out.println("Masukkan Gaji Pokok(dalam Rp.) : ");
            long GajiPokok = x.nextLong();
                System.out.println("Masukkan Lama Lembur(dalam Jam) : ");
            int LamaLembur = x.nextInt();

            //Menghitung Tunjangan Karyawan dari Gaji Pokok dan Lama Lembur
            double TunjanganKaryawan = GajiPokok * 0.2 ;
            switch (LamaLembur < 1 ? 'A'
            : (LamaLembur >= 1) && (LamaLembur < 10 ) ? 'B'
            : (LamaLembur >= 10) && (LamaLembur < 20 ) ? 'C'
            : LamaLembur >= 20 ? 'D' : 'E') {
                case 'A':
                TunjanganKaryawan += LamaLembur * 0 ;
                    break;
                case 'B':
                TunjanganKaryawan += LamaLembur * 1000 + 100000 ;
                    break;
                case 'C':
                TunjanganKaryawan += LamaLembur * 1000 + 200000 ;
                    break;
                case 'D':
                TunjanganKaryawan += LamaLembur * 1000 + 300000 ;
                    break;
            }
        
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

