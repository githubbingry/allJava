package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_21 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees : ");
        double x1 = x.nextDouble(), y1 = x.nextDouble();
        System.out.print("\nEnter point 2 (latitude and longitude) in degrees : ");
        double x2 = x.nextDouble(), y2 = x.nextDouble();
        System.out.printf("\nThe distance between the two points is %5.11f km\n", distance(x1, y1, x2, y2));
        x.close();
    }
    public static double sin(double a){
        return Math.sin(Math.toRadians(a));
    }
    public static double cos(double a){
        return Math.cos(Math.toRadians(a));
    }
    public static double arccos(double a){
        return Math.acos(a);
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return 6371.01 * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));
    }
}
