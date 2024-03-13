package formatMethod;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner x =  new Scanner(System.in);
        long n = x.nextInt();
        long[] ar = new long[(int)n];
        isiArr(x, ar);
        insertSort(ar);
        printArr(ar);
        x.close();
    }

    public static void isiArr(Scanner x, long[] ar){
        for (int i = 0; i < ar.length ;i++){
            ar[i] = x.nextLong();
        }
    }

    public static long[] insertSort(long[] ar){
        for (int i = 0; i < ar.length; i++){
            int j = i;
            while (j > 0 && ar[j-1] > ar[j]){
                long temp = ar[j-1];
                ar[j-1] = ar[j];
                ar[j] = temp;
                j--;
            }
        }
        return ar;
    }

    public static void printArr(long[] ar){
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
