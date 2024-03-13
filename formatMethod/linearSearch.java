package formatMethod;

import java.util.Scanner;

public class linearSearch { // sequential search
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        long n = x.nextLong();
        long[] ar = new long[(int)n];
        isiArr(x, ar);
        long elem = x.nextLong();
        sequentialSearch(elem, ar);
        x.close();
    }

    public static void isiArr(Scanner x, long[] ar){
        for (int i = 0; i < ar.length ;i++){
            ar[i] = x.nextLong();
        }
    }
    
    public static long[] sequentialSearch(long elem, long[] ar){
        long j = 0, indeks[] = new long[ar.length];
        for (int i = 0; i < ar.length; i++){
            if (ar[i] == elem) {
                indeks[(int)j] = i;
                j++;
            }
        }
        return indeks;
    }
}
