package formatMethod;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), elem = x.nextLong();
        long ar[] = new long[(int)n];
        isiArr(x, ar);
        int i = binarySearc(elem, ar) + 1;
        display(i);
        x.close();
    }

    public static void isiArr(Scanner x, long[] ar){
        for (int i = 0; i < ar.length ;i++){
            ar[i] = x.nextLong();
        }
    }

    public static int binarySearc(long elem, long[] ar){
        int h = ar.length - 1, l = 0, m;
        while (h >= l){
            m = (h + l) / 2;
            if (ar[m] == elem) return m;
            else if (ar[m] > elem) h = m - 1;
            else l = m + 1;
        }
        return -1;
    }

    public static void display(int i){
        if (i == -1) System.out.println("tidak ditemukan");
        else System.out.println("elemen terdapat pada elemen " + i);
    }
}
