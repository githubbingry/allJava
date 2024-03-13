package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_15 {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in) ;
        System.out.print("Enter x1 and y1 :");
        double x1 = x.nextDouble();
        double y1 = x.nextDouble();
        System.out.print("Enter x2 and y2 :");
        double x2 = x.nextDouble();
        double y2 = x.nextDouble();
        System.out.print("Enter x3 and y3 :");
        double x3 = x.nextDouble();
        double y3 = x.nextDouble();
        double side1 = Math.pow(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) ,0.5);
        double side2 = Math.pow(Math.pow(x2-x3,2) + Math.pow(y2-y3,2) ,0.5);
        double side3 = Math.pow(Math.pow(x3-x1,2) + Math.pow(y3-y1,2) ,0.5);
        double s = (side1 + side2 + side3)/2;
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        System.out.println("the area of the triangle is " + area);
    x.close();
    }
}
