package formatMethod;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner x =  new Scanner(System.in);
        long n = x.nextInt();
        long[] ar = new long[(int)n];
        isiArr(x, ar);
        selectSort(ar);
        printArr(ar);
        x.close();
    }
    
    public static void isiArr(Scanner x, long[] ar){
        for (int i = 0; i < ar.length ;i++){
            ar[i] = x.nextLong();
        }
    }

    public static long[] selectSort(long[] ar){
        for (int i = 0; i < ar.length; i++){
            long m = ar[i];
            int m_i = i;
            for (int j = i; j < ar.length; j++){
                if (m > ar[j]){
                    m = ar[j];
                    m_i = j;
                }
            }
            if (i != m_i){
                ar[m_i] = ar[i];
                ar[i] = m;
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
