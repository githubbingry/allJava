package Buat_Soal.fibonacci;

import java.util.Scanner;

public class nth_fibonacci {
    public static void main(String[] args) {
        try {
            Scanner x = new Scanner(System.in);
            int p = x.nextInt();
            int[] initial = new  int[p];
            inisialisasi(x, p, initial);
            int n = x.nextInt()-1; //maks unknown, depends on input from user of a and b
            display(n, p, initial);
            x.close();
        } catch (Exception e) {
            System.out.println("out of range");
        }
    }

    static int Fibonacci(int p, int n, int result, int[] memo, int[] initial){
        for (int i = 0; i<=n ; i++){
            if (i < p)
                result = initial[i];
            else{
                for (int j = 1; j<=p ; j++){
                    if (j == 1)
                        result = memo[i-1];
                    else
                        result += memo[i-j];
                }
            }
            memo[i]=result;
        }
        return memo[n];
    }

    static int[] inisialisasi(Scanner x, int p, int[] initial){
        for (int i = 0; i<p ; i++){
            initial[i] = x.nextInt();
        }
        return initial;
    }

    static void display(int n, int p, int[] initial){
        if (n < 0 || n > 100 || p < 2 || n < p)
            System.out.println("out of range");
        else {
            int result = 0;
            int [] memo = new int[n+1] ;
            for (int i = 0; i <= n ;i++){
                if (Fibonacci(p, n, result, memo, initial) > Integer.MAX_VALUE || Fibonacci(p, n, result, memo, initial) < Integer.MIN_VALUE){
                    System.out.println("out of range");
                    return;
                } else
                    System.out.print(Fibonacci(p, i, result, memo, initial) + " ");
            }
        }
        System.out.println();
    }
}
