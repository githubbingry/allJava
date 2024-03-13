package Buat_Soal.fibonacci;

import java.util.Scanner;

//7...

public class tribonacci2 {
    public static void main(String[] args) {
        try {
            Scanner x = new Scanner(System.in);
            int[] initial = new  int[3];
            inisialisasi(x, initial);
            int n = x.nextInt()-1; //maks unknown, depends on input from user of a and b
            display(n, initial);
            x.close();
        } catch (Exception e) {
            System.out.println("out of range");
        }
        
    }

    static int Fibonacci(int n, int result, int[] memo, int[] initial){
        for (int i = 0; i<=n ; i++){
            if (i < 3)
                result = initial[i];
            else
                result = memo[i-1] + memo[i-2] + memo[i-3];
            memo[i]=result;
        }
        return memo[n];
    }

    static int[] inisialisasi(Scanner x, int[] initial){
        for (int i = 0; i<3 ; i++){
            initial[i] = x.nextInt();
        }
        return initial;
    }

    static void display(int n, int[] initial){
        if (n < 0 || n > 46)
            System.out.println("out of range");
        else {
            int result = 0;
            int [] memo = new int[n+1] ;
            for (int i = 0; i <= n ;i++){
                System.out.print(Fibonacci(i, result, memo, initial) + " ");
            }
        }
    }

    // public static void main(String[] args) {
    //     //Given N
    //     Scanner x = new Scanner(System.in);
    //     int num1 = x.nextInt();
    //     int num2 = x.nextInt();
    //     int num3 = x.nextInt();
    //     int N = x.nextInt(); //maks unknown, depends on input from user of num1, num 2, and num3
    //     x.close();

    //     // Print first 10 term
    //     for (int i = 0; i < N; i++)
    //         System.out.print(fib(i, num1, num2, num3) + " ");
    // }

    // static int fib(int n, int num1, int num2, int num3)
    // {

    //     // Declare an array to store
    //     // Fibonacci numbers.
    //     // 1 extra to handle case, n = 0
    //     int f[] = new int[n + 3];

    //     int i;

    //     // 0th and 1st number of
    //     // the series are 0 and 1
    //     f[0] = num1;
    //     f[1] = num2;
    //     f[2] = num3;

    //     for (i = 3; i <= n; i++) {

    //         // Add the previous 2 numbers
    //         // in the series and store it
    //         f[i] = f[i - 1] + f[i - 2] + f[i - 3] ;
    //     }

    //     // Nth Fibonacci Number
    //     return f[n];
    // }
}
