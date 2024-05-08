package Soal_Pemro_Comp.soal14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class soal14_15 {
    public static void main(String[] args) throws IOException{
        File file = new File("D:\\VSCode\\Java\\Sup\\src\\Soal_Pemro_Comp\\soal14\\Exercise14_15.txt"); // change where the file want to be written
        if (!file.exists()) {
            try (PrintWriter output = new PrintWriter(file)) {
                for (int i = 0; i < 100; output.print((int)(Math.random()*100) + i++ +" "));
            } catch (Exception e) {
                System.out.println("Error creating file.");
            }
        }

        try (Scanner input = new Scanner(file)) {
            int[] ar = new int[100];
            for(int i = 0; i < 100 && input.hasNextInt(); ar[i++] = input.nextInt());
            quickSorting(ar, 0, ar.length - 1);
            for(int i = 0; i < 100; System.out.println(ar[i++]));
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    static void quickSorting(int[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSorting(data, low, pi - 1);
            quickSorting(data, pi + 1, high);
        }
    }

    static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }
}
