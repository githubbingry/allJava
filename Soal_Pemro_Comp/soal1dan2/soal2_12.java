package Soal_Pemro_Comp.soal1dan2;

import java.util.Scanner;

public class soal2_12 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter speed and acceleration :");
        double v = x.nextDouble();
        double a = x.nextDouble();
        double length = v*v/(2*a);
        System.out.println("The minimum runaway length for this airplane is "+length);
        x.close();
    }
}
