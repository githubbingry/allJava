package Soal_Pemro_Comp.soal5;

import java.util.Scanner;

public class soal5_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan 3 angka yang ingin diurutkan : ");
        double num1 = x.nextDouble(), num2 = x.nextDouble(), num3 = x.nextDouble();
        displaySortedNumbers(num1, num2, num3);
        x.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        // if (num1 > num2) {
        //     num1 = num1 + num2;
        //     num2 = num1 - num2;
        //     num1 = num1 - num2;
        //     if (num2 > num3) {
        //         num2 = num2 + num3;
        //         num3 = num2 - num3;
        //         num2 = num2 - num3;
        //         if (num1 > num2) {
        //             num1 = num1 + num2;
        //             num2 = num1 - num2;
        //             num1 = num1 - num2;
        //         }
        //     }
        // } else if (num2 > num3) {
        //     num2 = num2 + num3;
        //     num3 = num2 - num3;
        //     num2 = num2 - num3;
        //     if (num1 > num2) {
        //         num1 = num1 + num2;
        //         num2 = num1 - num2;
        //         num1 = num1 - num2;
        //     }
        // }
        double temp;
        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
            if (num2 > num3) {
                temp = num3;
                num3 = num2;
                num2 = temp;
                if (num1 > num2) {
                    temp = num2;
                    num2 = num1;
                    num1 = temp;
                }
            }
        } else if (num2 > num3) {
            temp = num3;
            num3 = num2;
            num2 = temp;
            if (num1 > num2) {
                temp = num2;
                num2 = num1;
                num1 = temp;
            }
        }
        // System.out.printf("Urutan angka tersebut adalah %f, %f, dan %f\n", num1, num2, num3);
        System.out.println("Urutan angka tersebut adalah "+num1+", "+num2+", dan "+ num3);
    }
}
