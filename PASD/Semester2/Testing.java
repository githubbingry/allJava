package PASD.Semester2;

import java.util.Scanner;

public class Testing{
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        // angka(1);
        int[] ar = new int[20];
        // int[] ar = new int[5];
        isiAr(ar);
        printAr(ar);
        System.out.printf("rata rata array berukuran %d adalah %f\n", ar.length, meanAr(ar));
        int n = x.nextInt();
        if (isExist(ar, n)) System.out.printf("angka %d ada didalam array", n);
        else System.out.printf("angka %d tidak ada didalam array", n);
        

        //pr
        System.out.println(factorial(10));
        System.out.println(perkalian(-10, 10));
        System.out.println(pangkat(-5, 4));
        System.out.println(penjumlahan(5, 4));
    }

    static void angka(int n){
        System.out.print(n);
        if(n < 10) angka(n + 1);
    }

    static void isiAr(int[] ar){
        for (int i = 0; i < ar.length; i++){
            ar[i] = (int)(Math.random()*100 + 1);
            // ar[i] = 5;
            // ar[i] = 15;
            // ar[i] = x.nextInt();
        }
    }

    static void printAr(int[] ar){
        for (int i = 0; i < ar.length; i++){
            System.out.printf("array ke %d adalah %d\n", i, ar[i]);
        }
    }

    static double meanAr(int[] ar){
        double sum = 0.0;
        for (int i = 0; i < ar.length; i++){
            sum += (double)ar[i];
        }
        return sum/ar.length;
    }

    static boolean isExist(int[] ar, int n){
        for (int i = 0; i < ar.length; i++){
            if (ar[i] == n) return true;
        }
        return false;
    }

/*
tugas fungsi rekursif, (koding, pahami karena bakal dipanggi)
1. factorial (x!)
2. perkalian (x * y)
3. pangkat (x ^ y) only N
4. penjumlahan (x + y) opsional
 */

    static int factorial(int a){
        if (a == 0 || a == 1) return 1;
        return a * factorial(a-1);
    }

    static int perkalian(int a, int b){
        if(a == 0 || b == 0) return 0;
        if(b == 1) return a;
        return b > 0 ? a + perkalian(a, b-1)
                    : -(a + perkalian(a, b*-1 -1));
    }

    static int pangkat(int a, int b){
        if(a == 0) return 0;
        if(b == 0) return 1;
        if(a == 0 && b == 0){
            System.out.println("Undefined");
            return 0;
        }
        if (b == 1) return a;
        return a * pangkat(a, b-1);
    }

    static int penjumlahan(int a, int b){
        if(b == 0) return 1;
        return b > 0 ? a + penjumlahan(a, b-a)
                    : (a - penjumlahan(a, b*-1 -1));
    }

/*
tugas array :
1. lakukan searching array, angka 5 pke while sehingga sampai ketemu saja
2. hitung kemunculan sebanyak brapa kali pada array
 */


}