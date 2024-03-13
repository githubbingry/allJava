package Struktur_Diskrit.Example;

import java.util.Scanner;

public class ExampleChapter2 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(
            """
            1. Decimal INT to Binary : Example 2.3.1 Hal.18
            2. Decimal FRAC to Binary : Example 2.3.2 Hal 20
            3. Decimal INT and FRAC to Octal : Example 2.4.1 Hal. 21
            Masukkan angka atau nomor yang ingin dilihat : """);
        int nomor = x.nextInt();
        switch (nomor) {
            case 1:decimalIntToBiner();break;
            case 2:decimalFractionToBiner();break;
            case 3:decimalToOctal();break;
            default:System.out.println("Tolong hanya masukkan angka yang teredia");break;
        }
    }

    //example 2.3.1 hal 18
    static void decimalIntToBiner(){
        System.out.println("Masukkan bilangan bulat yang ingin diubah ke biner : ");
        int n = x.nextInt();
        String temp = "";
        System.out.printf("Hasil %d ke biner adalah : ", n);
        do {
            temp = n % 2 + temp;
            n /= 2;
        } while (n != 0);
        // for(int j = temp.length()-1; j >= 0; j--){
        //     System.out.print(temp.charAt(j));
        // }
        System.out.println(temp);
    }

    //example 2.3.2 hal.20
    static void decimalFractionToBiner(){
        System.out.print("Masukkan angka pecahan yang ingin diubah ke biner : ");
        double n = x.nextDouble(), m = 0.0;
        System.out.print("Masukkan banyak digit setelah koma : ");
        int digit = x.nextInt(), i = 0;
        System.out.printf("Hasil %f ke biner adalah : 0,", n);
        do {
            m = 2*n;
            System.out.print((int)Math.floor(m));
            n = m - Math.floor(m);
        } while (n != 0 && ++i != digit);
    }

    //example 2.4.1 hal.21
    static void decimalToOctal(){
        System.out.print("Masukkan angka desimal yang ingin diubah ke oktal : ");
        double n = x.nextDouble(), m = 0.0;
        System.out.print("Masukkan banyak digit setelah koma : ");
        int digit = x.nextInt(), i = 0, nInt = (int)n;
        String temp = "";
        
        // int
        do {
            temp = nInt % 8 + temp;
            nInt /= 8;
        } while (nInt != 0);
        System.out.printf("Hasil %f ke oktal adalah : ", n);
        // for(int j = temp.length()-1; j >= 0; j--){
        //     System.out.print(temp.charAt(j));
        // }

        System.out.print(temp + ","); //koma

        // fraction
        n -= Math.floor(n);
        do {
            m = 8*n;
            System.out.print((int)Math.floor(m));
            n = m - Math.floor(m);
        } while (n != 0 && ++i != digit);
    }
}
