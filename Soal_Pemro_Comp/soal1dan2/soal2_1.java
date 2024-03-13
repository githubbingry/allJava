package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;
public class soal2_1 {
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
            System.out.println("\nEnter a temperature in celcius: ");
                double celcius = y.nextDouble();
                double fahrenheit = (9.0/5) * celcius + 32 ;
            System.out.println("\n" + fahrenheit +" F°");
        y.close();
    }
}
