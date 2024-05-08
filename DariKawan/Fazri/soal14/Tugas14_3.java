package DariKawan.Fazri.soal14; // hapus atau ganti sesuai path package

/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Nama File: Tugas14_2.java
 */

import java.util.Random;
import java.util.Scanner;

public class Tugas14_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the index of the array: ");
            int index = input.nextInt();

            System.out.println("The value of arr[" + index + "] is " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        }
    }
}