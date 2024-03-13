package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_14 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = x.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = x.nextDouble();
        weight *= 0.45359237;
        height *= 0.0254;
        double BMI = weight / Math.pow(height,2);
        System.out.println("BMI is " + BMI);
        x.close();
    }
}
