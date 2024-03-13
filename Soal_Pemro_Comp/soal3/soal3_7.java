package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_7{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the amount of money : ");
        double money = x.nextDouble();
        int sisa = (int)(money*100);
        int d = sisa/100;
            sisa %= 100;
        int q = sisa/25;
            sisa %= 25;
        int di = sisa/10;
            sisa %= 10;
        int n = sisa/5;
            sisa %= 5;
        int p = sisa;
        System.out.println("Your amount " + money + " consists of :");

        String sd = (d > 1 ) ? " dollars" : " dollar" ;
        System.out.println(d+sd);

        String sq = (q > 1 ) ? " quarters" : " quarter" ;
        System.out.println(q+sq);

        String sdi = (di > 1 ) ? " dimes" : " dime" ;
        System.out.println(di+sdi);

        String sn = (n > 1 ) ? " nickels" : " nickel" ;
        System.out.println(n+sn);

        String sp = (p > 1 ) ? " pennies" : " penny" ;
        System.out.println(p+sp);
        x.close();
    }
}