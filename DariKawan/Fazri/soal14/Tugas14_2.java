package DariKawan.Fazri.soal14; // hapus atau ganti sesuai path package

/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Nama File: Tugas14_2.java
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas14_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1 = 0, num2 = 0;
            boolean correctInput = false;

            while (!correctInput) {
                try {
                    System.out.print("Enter the first integer: ");
                    num1 = input.nextInt();

                    System.out.print("Enter the second integer: ");
                    num2 = input.nextInt();

                    correctInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input format. Please enter an integer.");
                    input.nextLine(); 
                }
            }

            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " + " + num2 + " is " + sum);
        }
    }
}
