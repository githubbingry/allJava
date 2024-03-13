package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_19{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter x1 and y1 : ");
        double x1 = x.nextDouble();
        double y1 = x.nextDouble();
        System.out.print("Enter x2 and y2 : ");
        double x2 = x.nextDouble();
        double y2 = x.nextDouble();
        double distance = Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2),0.5);
        System.out.println("The distance between the two points is " + distance);
        x.close();
    }
}