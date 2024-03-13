package Buat_Soal.fibonacci;

import java.util.Scanner;

//3...

public class fibonacci { //1 1 2 3 5 8 13 21 34 55 ...
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt()-1; // maks 46
        display(n);
        x.close();
    }

    static int Fibonacci(int n, int result, int[] memo){
        for (int i = 0; i<=n ; i++){
            if (i < 2)
                result = 1;
            else
                result = memo[i-1] + memo[i-2];
                // result = memo[i-1] + memo[i-3]; // gunakan ini jika baris fibonacci dimulai dari 0
            memo[i]=result;
        }
        return memo[n];
    }

    static void display(int n){
        if (n < 0 || n > 46)
            System.out.println("out of range");
        else {
            int result = 0;
            int [] memo = new int[n+1] ;
            for (int i = 0; i <= n ;i++){
                System.out.print(Fibonacci(i, result, memo) + " ");
            }
        }
    }
}
