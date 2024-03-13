package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the amount of tuition :");
        int tuition = x.nextInt();
        System.out.println("Enter the amount of percentage :");
        double percentage = x.nextDouble()/100;
        System.out.println("Enter how long in years :");
        int year = x.nextInt();
        int temp = tuition;
        for (int i=0 ; i<year ; i++){
            tuition += temp*percentage;
            temp = tuition;
        }
        System.out.println("The amount of tuition in "+year+" years are "+tuition);
        x.close();
    }
}
