package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in) ;
        System.out.println("Enter the amount of water in kilograms");
        double m = x.nextDouble() ;
        System.out.println("Enter the initial temperature");
        double temp = x.nextDouble() ;
        System.out.println("Enter the final temprature");
        double fintemp = x.nextDouble();
        double Q= m*(fintemp - temp)*4184;
        System.out.println("the energy needed is 55.5" + Q);
    x.close();
    }
}
