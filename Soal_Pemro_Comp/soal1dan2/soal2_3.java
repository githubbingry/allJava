package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;
public class soal2_3
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
            System.out.println("Enter a value for feet :");
                double feet = x.nextDouble();
                double meters = feet * 0.305;
            System.out.println(feet + " feet is " + meters + " meters");
        x.close();
    }
}
