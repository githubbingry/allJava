package GDSC_UNSRI;

import java.util.Scanner;

public class PatternAngkaBintang {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // input n baris
        int n = x.nextInt();

        //constraint 1<=n<=100
        if (n>=1 && n<=100){

            // melakukan loop sebanyak n baris
            for (int i = 1; i <= n; i++){

                 //print angka
                for (int j = 1; j <= i ; j++){

                    // print angka dari 1
                    if (i<10)
                    System.out.print(i+" ");
                    else
                    System.out.print(i);

                    // kondisi banyak bintang kurang satu dari banyak angka
                    if(j!=i)

                    // print bintang
                    System.out.print("*");

                //loop print angka dan bintang sebanyak i
                }

                // print baris baru setiap loop baris
                System.out.println();

            // loop print pattern sebanyak n
            }

            // melakukan loop sebanyak n-1 baris
            for (int i = n-1; i >= 1; i--){

                 //print angka
                for (int j = 1; j <= i ; j++){

                    // print angka dari n-1
                    if (i<10)
                    System.out.print(i+" ");
                    else
                    System.out.print(i);

                    // kondisi banyak bintang kurang satu dari banyak angka
                    if(j!=i)

                    // print bintang
                    System.out.print("*");

                //loop print angka dan bintang sebanyak i
                }

                // print baris baru setiap loop baris
                System.out.println();
            }
        }
        x.close();
    }
}
