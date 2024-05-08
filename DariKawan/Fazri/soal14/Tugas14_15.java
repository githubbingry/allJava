package DariKawan.Fazri.soal14;

/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Nama File: Tugas14_2.java
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Tugas14_15 {
    public static void main(String[] args) {
        File file = new File("Exercise14_15.txt");
        if (!file.exists()) {
            try (PrintWriter output = new PrintWriter(file)) {
                Random rand = new Random();
                for (int i = 0; i < 100; i++) {
                    output.print(rand.nextInt() + " ");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error creating file.");
            }
        }

        try (Scanner input = new Scanner(file)) {
            int[] nums = new int[100]; // Menggunakan static array karena diketahui hanya terdapat 100 angka, jika tidak, gunakan ArrayList atau dynamic linear DSA lainnya
            int index = 0;
            while (input.hasNextInt() && index < 100) {
                nums[index++] = input.nextInt();
            }

            quickSort(nums, 0, nums.length - 1);
            printArr(nums);
        } catch (FileNotFoundException e) {
            System.out.println("File not found, but it passed the first check?");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}