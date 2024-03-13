package DariKawan.Putri;

import java.util.Scanner;
import java.util.Arrays;

public class LatihanBinSearch {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int[] Angka = new int[50];
        // int[] indeks = new int[Angka.length];
        for (int i = 0; i < Angka.length; i++) {
            Angka[i] = (int) (Math.random() * 100);
        }

        System.out.println("sebelum sortir");
        for (int i = 0; i < Angka.length; i++) {
            System.out.print(Angka[i] + " ");
        }
        System.out.println();

        System.out.println("setelah sortir");
        Arrays.sort(Angka);
        for (int i = 0; i < Angka.length; i++) {
            System.out.print(Angka[i] + " ");
        }
        System.out.println();

        System.out.print("Masukke angko yang nak kau cari: ");
        int cari = Sc.nextInt();
        boolean ketemu = binarySearch(Angka, cari, 0, Angka.length - 1);
        if (ketemu) {
            System.out.println("Nomernyo ketemu");
        } else {
            System.out.println("KATEKKK NOMERNYO.");
        }
        Sc.close();
    }
    public static boolean binarySearch(int[] a, int cari, int awal, int akhir) {
        if (awal > akhir) {
            return false;
        }
        int tengah = (awal + akhir) / 2;
        if (cari == a[tengah]) {
            return true;
        } else if (a[tengah] > cari) {
            return binarySearch(a, cari, awal, tengah - 1);
        } else {
            return binarySearch(a, cari, tengah + 1, akhir);
        }
    }
}
