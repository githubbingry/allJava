package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_35 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double s = x.nextDouble();
        System.out.println("The area of the pentagon is " + area(s));
        x.close();
    }
    public static double area(double s){
        return (5 * s * s) / (4 * Math.tan(Math.PI / 5));
    }
}
