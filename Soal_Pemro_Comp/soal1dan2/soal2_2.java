package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;
public class soal2_2 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
            System.out.println("\nEnter radius :" );
                double radius = x.nextDouble();
            System.out.println("\nEnter lenght :" );
                double lenght = x.nextDouble();
                double phi = 3.14 ;
                double area = radius * radius * phi;
                double volume = area * lenght;
            System.out.println("\nThe area is " + area +" and the volume is "+ volume);
        x.close();
    }
}
