package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Please input a number between 0 and 1000 :");
        int i = x.nextInt();
        if (i>0 && i< 1000 ) {
            System.out.println("The sum off the digits are " + (i/100 + (i/10)%10 + i%10));
        } else {
            System.out.println("Please only input a number between 0 and 1000.");
        }
        x.close();
    }
}
