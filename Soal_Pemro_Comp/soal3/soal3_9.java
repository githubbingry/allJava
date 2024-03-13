package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int angka = x.nextInt();
        // int d1 = angka / 100000000 % 10;
        int d10 = 0;
        // for(int i=8;i>0;i--){
        //     d10 += angka/Math.pow(10,i-1)%10*(10-i);
        // }
        int d = angka;
        for(int i=9;i>0;i--){
            d10 += d%10*i;
            d /= 10;
        }
        // d10 += d1;
        d10 %= 11;

        System.out.printf("The ISBN-10 number is %09d", angka);
        if (d10 == 10)
            System.out.print("X");
        else
            System.out.print(d10);
        
        // if (d1==0){
        // String str = String.format("%09d", angka,d10);
        //     if (d10==10)
        //     System.out.println(str+"X");
        //     else
        //     System.out.println(str+d10);
        // } else {
        //     if (d10==10)
        //     System.out.println(angka+"X");
        //     else
        //     System.out.println(angka*10+d10);
        //}
        x.close();
    }
}
