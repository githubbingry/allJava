package coba                                                                                                            ;

import java.util.Scanner                                                                                                ;

public class ar2D                                                                                                       {
    public static void main(String[] args)                                                                              {
        Scanner x = new Scanner(System.in)                                                                              ;
        int[][] matriks = new int[10][10]                                                                               ;
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}                                                                      ;
        matriks[0] = ar                                                                                                 ;
        // for(int i = 0; i < matriks[0].length; i++)                                                                   {
        //     System.out.print(matriks[0][i] + " ")                                                                    ;}
        n()                                                                                                             ;
        isiRandom(matriks)                                                                                              ;
        n()                                                                                                             ;
        printMatriks(matriks)                                                                                           ;
        n()                                                                                                             ;
        printSum(matriks)                                                                                               ;
        n()                                                                                                             ;
        printSumRow_maksSumRow(matriks)                                                                                 ;
        n()                                                                                                             ;
        printSumCol_maksSumCol(matriks)                                                                                 ;
        x.close()                                                                                                       ;}

    static int[][] isiRandom(int[][] ar)                                                                                {
        for (int i = 0; i < ar.length; i++)                                                                             {
            for (int j = 0; j < ar[i].length; j++)                                                                      {
                ar[i][j] = (int)(Math.random()*100)                                                                     ;}}
        return ar                                                                                                       ;}

    static void printMatriks(int[][] ar)                                                                                {
        for (int i = 0; i < ar.length; i++)                                                                             {
            for (int j = 0; j < ar[i].length; j++)                                                                      {
                System.out.print(ar[i][j] + " ")                                                                        ;}
            System.out.println()                                                                                        ;}}

    static void printSum(int[][] ar)                                                                                    {
        int total = 0                                                                                                   ;
        total = sumElem(ar)                                                                                             ;
        System.out.println("Total semua bilangan diatas adalah "+total)                                                 ;}

    static int sumElem(int[][] ar)                                                                                      {
        int total = 0                                                                                                   ;
        for (int i = 0; i < ar.length; i++)                                                                             {
            for (int j = 0; j < ar[i].length; j++)                                                                      {
                total += ar[i][j]                                                                                       ;}}
        return total                                                                                                    ;}

    static int sumRow(int[][] ar, int baris)                                                                            {
        int total = 0                                                                                                   ;
        for (int j = 0; j < ar[baris].length; j++)                                                                      {
            total += ar[baris][j]                                                                                       ;}
        return total                                                                                                    ;}

    static void printSumRow_maksSumRow(int[][] ar)                                                                      {
        int totalRow = 0, maksRow = 0, maksIndeks = 0                                                                   ;
        for (int i = 0; i < ar.length; i++)                                                                             {
            totalRow += sumRow(ar, i)                                                                                   ;
            System.out.println("Jumlah bilangan baris ke "+ (i + 1) +" adalah "+ totalRow)                              ;
            if (i == 0) maksRow = totalRow                                                                              ;
            else if (maksRow < totalRow)                                                                                {
                maksRow = totalRow                                                                                      ;
                maksIndeks = i                                                                                          ;}
            totalRow = 0                                                                                                ;}
        System.out.println("Jumlah maksimum digapai oleh baris ke "+ maksIndeks +" yaitu "+ maksRow)                    ;}

    static int sumCol(int[][] ar, int kolom)                                                                            {
        int total = 0                                                                                                   ;
        for (int j = 0; j < ar.length; j++)                                                                             {
            total += ar[j][kolom]                                                                                       ;}
        return total                                                                                                    ;}

    static void printSumCol_maksSumCol(int[][] ar)                                                                      {
        int totalCol = 0, maksCol = 0, maksIndeks = 0                                                                   ;
        for (int i = 0; i < ar.length; i++)                                                                             {
            totalCol += sumCol(ar, i)                                                                                   ;
            System.out.println("Jumlah bilangan kolom ke "+ (i + 1) +" adalah "+ totalCol)                              ;
            if (i == 0) maksCol = totalCol                                                                              ;
            else if (maksCol < totalCol)                                                                                {
                maksCol = totalCol                                                                                      ;
                maksIndeks = i                                                                                          ;}
            totalCol = 0                                                                                                ;}
        System.out.println("Jumlah maksimum digapai oleh kolom ke "+ maksIndeks +" yaitu "+ maksCol)                    ;}

    static void n()                                                                                                     {
        System.out.println()                                                                                            ;}}