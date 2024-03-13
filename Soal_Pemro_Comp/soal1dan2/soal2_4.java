package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;
public class soal2_4
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
            System.out.println("Enter a number in kilograms :");
                double kilograms = x.nextDouble();
                double pounds = kilograms / 0.454;
            System.out.println(pounds + " pounds is " + kilograms + "  kilograms");
        x.close();
    }
}
