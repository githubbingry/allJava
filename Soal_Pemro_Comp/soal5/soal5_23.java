package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_23 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter three points : ");
        double x1 = x.nextDouble(), y1 = x.nextDouble();
        double x2 = x.nextDouble(), y2 = x.nextDouble();
        double x3 = x.nextDouble(), y3 = x.nextDouble();
        double a, b, c;
        a = side(x2, y2, x3, y3);
        b = side(x1, y1, x3, y3);
        c = side(x2, y2, x1, y1);
        display(a, b, c);
        x.close();
    }
    public static double side(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    public static double ArcCos(double a, double b, double c){
        return Math.acos((a * a - b * b - c * c) / (-2 * b * c));
    }
    public static void display(double a, double b, double c){
        double A, B, C;
        A = Math.toDegrees(ArcCos(a, b, c));
        B = Math.toDegrees(ArcCos(b, a, c));
        C = Math.toDegrees(ArcCos(c, b, a));
        System.out.printf("The three angles are %5.2f, %5.2f, and %5.2f", A, B, C);
    }
}
