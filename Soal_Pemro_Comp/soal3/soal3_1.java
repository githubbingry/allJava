package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_1{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a, b, and c :");
        double a = x.nextDouble(), b = x.nextDouble(), c = x.nextDouble();
        double D = Math.pow(Math.pow(b,2)-4*a*c, 0.5);
        if (D>0){
            double x1 = (-b + D)/(2*a);
            double x2 = (-b - D)/(2*a);
            System.out.println("The roots are "+x1+" and "+x2);
        } else if (D==0){
            double x1 = -b/(2*a);
            System.out.println("The root is "+x1);
        }else
            System.out.println("The equation has no real roots");
        System.out.println("D is "+D);
        x.close();
    }
}