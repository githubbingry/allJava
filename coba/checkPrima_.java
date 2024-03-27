package coba;

import java.util.Scanner;

// 2...

public class checkPrima_ {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat ");
        int prima = x.nextInt(), factor = 0;

        // if (prima < 2){
        //     System.out.println("Bukan bilangan Prima");
        // } else if (prima == 2 || prima == 3 || prima ==5 || prima ==7){
        //     System.out.println("Bilangan prima");
        // } else if (prima % 2 == 0 || prima % 3 ==0 || prima % 5 == 0 || prima % 7 == 0){
        //     System.out.println("Bukan bilangan prima");
        // } else System.out.println("Bilangan prima");

        for (int i = 1; i <= prima; i++,i++){
            // if (i == 1)
            //     System.out.println(i+1);
            // else if (i == 2 || i == 3 || i ==5 || i ==7)
            //     System.out.println(i);
            // else if (i % 3 ==0 || i % 5 == 0 || i % 7 == 0)
            //     continue;
            // else
            //     System.out.println(i);
            for (int j = 2; j<=prima; j++){
                if (prima%j==0)
                    factor++;
                if (factor>1)
                    break;
            }
            if (factor==1)
                System.out.println(i);
            else
                System.out.println(i + "bukan bilangan prima");
        }
        x.close();
    }
}
