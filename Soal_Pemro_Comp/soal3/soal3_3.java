package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, and f :");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        double det = a*d-b*c;
        double x = (e*d-b*f)/det;
        double y = (a*f-e*c)/det;
        if (det!=0)
        System.out.println("X is " + x + " and y is " + y);
        else
        System.out.println("The equation has no solution");
        scan.close();
    }
}
