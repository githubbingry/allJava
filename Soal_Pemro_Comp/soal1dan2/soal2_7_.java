package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;
public class soal2_7_ {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("tolong masukkan lama menit :");
            long menit = x.nextLong();
            long hari = menit / 1440 ;
            long tahun = hari / 365 ;
            long sisahari = hari % 365 ;
            long jam = sisahari / 24 ;
            long sisajam = jam % 24 ;
            long Menit = sisajam / 60 ;
        System.out.println(menit + " menit adalah " + tahun + " tahun " + sisahari + " hari " + jam + " jam dan " + Menit + " menit") ;
        x.close();

    }
}
