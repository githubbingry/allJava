package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_36 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of side : ");
        double n = x.nextDouble();
        System.out.print("Enter the side : ");
        double s = x.nextDouble();
        System.out.println("The area of the pentagon is " + area(n, s));
        x.close();
    }
    public static double area(double n, double s){
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
}
