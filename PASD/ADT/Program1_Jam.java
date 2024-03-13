package PASD.ADT;

import java.util.Scanner;

public class Program1_Jam {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int jam = x.nextInt(), menit = x.nextInt(), detik = x.nextInt();
        int j = jam * 3600 + menit * 60 + detik;
        System.out.printf("Hasil konversi dari %d jam %d menit %d detik adalah %d", jam, menit, detik, j);
        x.close();
    }
}

/*

Program KonversiJamKeDetik

Deklarasi :
jam, menit, detik, j : int

Algoritma :
read(jam);
read(menit);
read(detik);
j <- jam * 3600 + menit * 60 + detik;
printf("Hasil konversi dari %d jam %d menit %d detik adalah %d", jam, menit, detik, j);

 */
