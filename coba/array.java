package coba;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // int jumlah=0;
        // for (int i=0; i<5; i++){
        //     int a =x.nextInt();
        //     jumlah += a;
        // }
        // jumlah /=5;
        // System.out.println(jumlah);

        // int n = x.nextInt(), jumlah=0, count =0;
        // int nilai[] = new int[n];
        // for (int i=0; i<n; i++){
        //     nilai[i] = x.nextInt();
        //     jumlah += nilai[i];
        // }
        // jumlah /= n;
        // System.out.println("rata rata "+jumlah);
        // for (int i=0; i<n; i++)
        //     if (nilai[i] > jumlah) count++;
        // System.out.println(count);

        int[] ar =new int[5];
        ar[0] = 12;
        ar[1] = 13;
        ar[2] = 14;
        ar[3] = 13;
        ar[4] = 12;
        for (int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        for (int i=0; i<4; i++){
            ar[i] = x.nextInt();
        }
        for (int i=0; i<5; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        x.close();
    }
}
