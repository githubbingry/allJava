package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_35 {
    public static void main(String[] args) { // 3, 8, 15, 24
        Scanner x = new Scanner(System.in);
        long n = x.nextLong();
        double sum = 0;
        // for (int i = 1; i <= n; i++){ // O(n)
        //     sum += 1 / (Math.sqrt(i) + Math.sqrt(i+1));
        // }
        // System.out.println(sum);

        sum = Math.sqrt(n + 1) - 1; // O(1)
        System.out.println(sum);
        
        x.close();
    }
}
// √2 - 1 ... n
// = (√2 - 1) + (√3 - √2) + (2 - √3) ... + (√(n+1) - √n)
// = √(n + 1) - 1