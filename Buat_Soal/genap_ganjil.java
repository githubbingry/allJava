package Buat_Soal;

import java.util.Scanner;

// 1..

public class genap_ganjil {
    public static void main(String[] args){
        try {
            Scanner x = new Scanner(System.in);
            System.out.println("input n : ");
            int n = x.nextInt();
            x.close();
            long start = System.currentTimeMillis();
            if (n < 0){
                System.out.println("\nganjil negatif");
                for (int i = 0; --i >= n; ){
                    System.out.println(i--);
                }
                    
                System.out.println("\ngenap negatif");
                for (int i = 0; --i > n; ){
                    System.out.println(--i);
                }
            }
            else if(n > 0){
                System.out.println("\nganjil positif");
                for (int i = 0; ++i <= n; ){
                    System.out.println(i++);
                }
                    
                System.out.println("\ngenap positif");
                for (int i = 0; ++i < n; ){
                    System.out.println(++i);
                }
            } else System.out.println("null");
            long duration = System.currentTimeMillis()-start;
            System.out.println(duration+" ms");
        } catch (Exception e) {
            System.out.println("please only input integer");
        }

        /*
            when n = 123123
            with try catch : 5716 ms, 5752 ms, 5752 ms, 5771 ms, 5900 ms, 5940 ms
            without it     : 5595 ms, 5589 ms, 5665 ms, 5716 ms, 5938 ms, 5988 ms
        
         */
    }
}
