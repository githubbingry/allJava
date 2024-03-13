package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int numb1 = x.nextInt();
        int numb2 = x.nextInt();
        int numb3 = x.nextInt();

        if (numb1 > numb2) {
            numb1 = numb1 ^ numb2;
            numb2 = numb1 ^ numb2;
            numb1 = numb1 ^ numb2;
            if (numb2 > numb3) {
                numb2 = numb2 ^ numb3;
                numb3 = numb2 ^ numb3;
                numb2 = numb2 ^ numb3;
                if (numb1 > numb2) {
                    numb1 = numb1 ^ numb2;
                    numb2 = numb1 ^ numb2;
                    numb1 = numb1 ^ numb2;
                }
            }
        } else if (numb2 > numb3) {
            numb2 = numb2 ^ numb3;
            numb3 = numb2 ^ numb3;
            numb2 = numb2 ^ numb3;
            if (numb1 > numb2) {
                numb1 = numb1 ^ numb2;
                numb2 = numb1 ^ numb2;
                numb1 = numb1 ^ numb2;
            }
        }

        System.out.printf("%d <= %d <= %d",numb1,numb2,numb3);
        x.close();
    }
}