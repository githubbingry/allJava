// hilangkan package jika tidak membuka dari folder "PASD"
package PASD.Selection;

import java.util.Scanner;

public class Program2_IfElse {
    public static void main(String[] args){
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
            if ((NilaiMahasiswa >= 81) && (NilaiMahasiswa <= 100 )) {
                Grade = "A" ;
            } else if ((NilaiMahasiswa >= 61) && (NilaiMahasiswa < 81 )) {
                Grade = "B" ;
            } else if ((NilaiMahasiswa >= 41) && (NilaiMahasiswa < 61 )) {
                Grade = "C" ;
            } else if ((NilaiMahasiswa >= 21) && (NilaiMahasiswa < 41 )) {
                Grade = "D" ;
            } else if ((NilaiMahasiswa >= 0) && (NilaiMahasiswa < 21 )) {
                Grade = "E" ;
            } else {
                Grade = "tidak masuk akal" ;
                System.out.println("Bro kok bisa nilai lu ampe ngelewatin batas gini (-_-)") ;
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