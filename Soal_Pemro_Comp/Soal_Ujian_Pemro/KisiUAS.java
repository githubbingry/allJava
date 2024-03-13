package Soal_Pemro_Comp.Soal_Ujian_Pemro;

import java.util.Scanner;

public class KisiUAS {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        // System.out.println("\nSoal 1 :\nMasukkan harga barang dan jumlah barang : ");
        // double harga = x.nextDouble(), barang = x.nextDouble();
        // System.out.println("Total harga barang adalah " + diskon(harga, barang));
        
        // System.out.println("\nSoal 2 :\nMasukkan id dan password : ");
        // String id = x.next(), password = x.next();
        // check(id, password);
        
        // System.out.println("\nSoal 3 :\nMasukkan n : ");
        // int n = x.nextInt(), memo[] = new int[n+1];
        // displayFibonacci(n, memo);
        
        System.out.println("\nSoal 4 :\nMasukkan a : ");
        int a = x.nextInt();
        faktorisasi(a);
        x.close();
    }

    static double diskon(double harga, double barang){
        double total = harga * barang;
        double diskon = 1;
        if (barang < 5) return total;
        else if (barang <= 10) diskon -= 0.05;
        else if (barang <= 20) diskon -= 0.1;
        else diskon -= 0.2;
        return total * diskon;
    }

    static void check(String id, String pw){
        if (id == "Fachry" && pw == "Gh1f4ry") System.out.println("Autentikasi Berhasil");
        else System.out.println("Autentikasi Gagal");
    }

    static int fibonacci(int n){
        if (n <= 2) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    static int fibonacci2(int n, int[] memo){
        int angka = 0;
        for (int i = 1; i <= n; i++){
            if (i <= 2) angka = 1;
            else angka = memo[i-1] + memo[i-2];
            memo[i] = angka;
        }
        return angka;
    }

    static void displayFibonacci(int n, int[] memo){
        for (int i = 1; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++){
            System.out.print(fibonacci2(i, memo) + " ");
        }
    }

    static void faktorisasi(int a){
        for (int i = 2; i <= a; i++){
            if (a % i == 0){
                System.out.print(i + " ");
                a /= i;
                i = 1;
                if (a == 1) return;
                else System.out.print("* ");
            }
        }
    }
}
