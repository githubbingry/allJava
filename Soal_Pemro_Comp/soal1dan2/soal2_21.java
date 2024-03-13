package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_21 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in) ;
        System.out.println("input investment amount");
            double investment_amount = x.nextDouble();
        System.out.println("input annual interest rate ");
            double annual_interest = x.nextDouble();
        System.out.println("input years");
            double years = x.nextDouble();
            double monthly_interest = annual_interest/1200 ;
            double future_investment = investment_amount*Math.pow((1+monthly_interest),years*12) ;
        System.out.println("accumulated value is " + future_investment);
        x.close();
    }
}
