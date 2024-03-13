package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in) ;
        System.out.println("input your saving :") ;
            double saving = x.nextDouble() ;
        System.out.println("input month") ;
            double month = x.nextDouble() ;
            saving *= month ;
            double annual_interest = 0.05 ;
            double monthly_interest = 1 + annual_interest / 12 ;
            double account_value = saving*Math.pow(monthly_interest, month) ;
        System.out.println("Total tabungan setelah " + month +" bulan adalah " + account_value);
        x.close();
    }
}

