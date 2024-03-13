package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = x.nextDouble();
        System.out.print("Enter height in feet: ");
        double feet = x.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = x.nextDouble();
        height += feet*12;
        weight *= 0.45359237;
        height *= 0.0254;
        double BMI = weight / Math.pow(height,2);
        System.out.println("Ur BMI is " + BMI);
        if (BMI < 18.5)
        System.out.println("U're Underweight m8, please eat some more!!");
        else if (BMI < 25)
        System.out.println("U're Normal, congrats!!");
        else if (BMI < 30)
        System.out.println("U're Overweight, do some diet!!");
        else
        System.out.println("U're Obese, PLEASE TAKE CARE OF UR HEALTH BRO!!");
        x.close();
    }
}
