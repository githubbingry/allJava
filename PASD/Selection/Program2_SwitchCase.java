// hilangkan package jika tidak membuka dari folder "PASD"
package PASD.Selection;

import java.util.Scanner;

public class Program2_SwitchCase {
    public static void main(String[] args) {
        //Handling exception error
        try {
            //Input
            Scanner x = new Scanner(System.in);
                System.out.println("Masukkan Nama Mahasiswa : ");
            String NamaMahasiswa = x.next();
                System.out.println("Masukkan Nilai Mahasiswa : ");
            double NilaiMahasiswa = x.nextDouble();
            String Grade = "Grade" ;

            //Menentukan Grade mahasiswa dari Nilai Mahasiswa
            switch ((NilaiMahasiswa >= 81) && (NilaiMahasiswa <= 100) ? 'A'
            : (NilaiMahasiswa >= 61) && (NilaiMahasiswa < 81 ) ? 'B'
            : (NilaiMahasiswa >= 41) && (NilaiMahasiswa < 61 ) ? 'C'
            : (NilaiMahasiswa >= 21) && (NilaiMahasiswa < 41 ) ? 'D'
            : (NilaiMahasiswa >= 0) && (NilaiMahasiswa < 21 ) ? 'E': 'F') {
                case 'A' :
                Grade = "A" ;
                    break;
                case 'B' :
                Grade = "B" ;
                    break;
                case 'C' :
                Grade = "C" ;
                    break;
                case 'D' :
                Grade = "D" ;
                    break;
                case 'E' :
                Grade = "E" ;
                    break;
                default :
                Grade = "tidak masuk akal" ;
                System.out.println("Bro kok bisa nilai lu ampe ngelewatin batas gini (-_-)") ;
                    break;
            }
            
            //Output
            System.out.println("Grade Mahasiswa " + NamaMahasiswa + " adalah " + Grade + " dengan nilai " + NilaiMahasiswa );
            x.close();
        } catch (Exception e) {
            // Display text ketika terjadi exception error
            System.out.println("Tolong hanya masukkan angka pada bagian Nilai Mahasiswa!");
        }
        
    }
}