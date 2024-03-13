package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;
public class soal2_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("\nEnter the subtotal :");
            double subtotal = x.nextDouble();
        System.out.println("\nEnter the gratitude rate in decimal :");
            double gratituderate = x.nextDouble();
            double gratuity = subtotal * gratituderate/100;
            double total = subtotal + gratuity;
        System.out.println("\nThe gratuity is $"+ gratuity + " and total is $"+ total);
        x.close();

    }
}
