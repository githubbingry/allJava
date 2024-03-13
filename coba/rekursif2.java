package coba;

import java.util.Scanner;

public class rekursif2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("input n : ");
        Long n = x.nextLong();
        System.out.print("input r : ");
        Long r = x.nextLong();
        long k = n;
        x.close();

        if (n==0 && r==0)
            System.out.println("Hasil pangkat 0^0 undefined");
        else if (n==0)
            System.out.println("Hasil pangkat dari bilangan berbasis nol adalah 0");
        else
            Pangkat(n, k, r);

        if (n<0 || r<0)
            System.out.println("untuk menghitung permutasi, masukan n dan r harus non negatif");
        else if (n<r)
            System.out.println("untuk menghitung permutasi, masukan r harus lebih kecil atau sama dengan n");
        else
            Permutasi(n, k, r);
    }

    static void Pangkat(Long n, Long k, Long r){
        if (r==0)
            System.out.println("Hasil Pangkat : "+1);
        else if (r==1)
            System.out.println("Hasil Pangkat : "+n);
        else if (r==-1)
            System.out.printf("Hasil Pangkat : 1/(%d)\n",n);
        else if (r>0){
            n*=k;
            Pangkat(n, k, r-1);
        } else if (r<0){
            n*=k;
            Pangkat(n, k, r+1);
        }
    }

    static void Permutasi(long n,long k, long r){
        if (r==0)
            System.out.println("Hasil permutasi : "+1);
        else if (r==1)
            System.out.println("Hasil Permutasi : "+n);
        else{
            n*=--k;
            Permutasi(n, k, r-1);
        }
    }
}
