package Buat_Soal.fibonacci;

import java.util.Scanner;

//7...

public class tribonacci {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt()-1; // maks 37
        display(n);
        x.close();
        
    }

    static int Fibonacci(int n, int result, int[] memo){
        for (int i = 0; i<=n ; i++){
            if (i < 3)
                result = 1;
            else
                result = memo[i-1] + memo[i-2] + memo[i-3];
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

    // public static void main(String[] args) {
    //     //Given N
    //     Scanner x = new Scanner(System.in);
    //     int N = x.nextInt(); // maks 37
    //     x.close();

    //     // Print first 10 term
    //     for (int i = 0; i < N; i++)
    //         System.out.print(fib(i) + " ");
    // }

    // static int fib(int n)
    // {

    //     // Declare an array to store
    //     // Fibonacci numbers.
    //     // 1 extra to handle case, n = 0
    //     int f[] = new int[n + 3];

    //     int i;

    //     // 0th and 1st number of
    //     // the series are 0 and 1
    //     f[0] = 1;
    //     f[1] = 1;
    //     f[2] = 1;

    //     for (i = 3; i <= n; i++) {

    //         // Add the previous 2 numbers
    //         // in the series and store it
    //         f[i] = f[i - 1] + f[i - 2] + f[i - 3] ;
    //     }

    //     // Nth Fibonacci Number
    //     return f[n];
    // }
}
