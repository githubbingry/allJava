package Soal_Pemro_Comp.soal1dan2;

import java.util.Scanner;

public class soal2_9 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter starting velocity(meters/second) :");
        double v0 = x.nextDouble();
        System.out.println("Enter ending velocity(meters/second) :");
        double v1 = x.nextDouble();
        System.out.println("Enter time span(second) :");
        double t = x.nextDouble();
        double a = (v1-v0)/t ;
        System.out.println("The average acceleration :  " + a);
        x.close();
    }
}