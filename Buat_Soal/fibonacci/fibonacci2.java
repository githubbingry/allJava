package Buat_Soal.fibonacci;

import java.util.Scanner;

//5...

public class fibonacci2 {
    public static void main(String[] args) {
        try {
            Scanner x = new Scanner(System.in);
            int[] initial = new  int[2];
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
            if (i < 2)
                result = initial[i];
            else
                result = memo[i-1] + memo[i-2];
            memo[i]=result;
        }
        return memo[n];
    }

    static int[] inisialisasi(Scanner x, int[] initial){
        for (int i = 0; i<2 ; i++){
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

    // //versi gfg
    // //4... modifikasi fibonacci
    // static void Fibonacci(int N, int num1, int num2)
    // {
    //     // bagian sini lebih fleksibel bs dirubah apa saja
    //     // int num1 = 1, num2 = 1;

    //     int counter = 0;

    //     // Iterate till counter is N
    //     while (counter < N) {

    //         // Print the number
    //         System.out.print(num1 + " ");

    //         // Swap
    //         int num3 = num2 + num1;
    //         num1 = num2;
    //         num2 = num3;
    //         counter++;
    //     }
    // }

    // // Driver Code
    // public static void main(String args[])
    // {
    //     // Given Number N
    //     Scanner x = new Scanner(System.in);
    //     int num1 = x.nextInt();
    //     int num2 = x.nextInt();
    //     int N = x.nextInt(); //maks unknown, depends on input from user of num1 and num 2
    //     x.close();

    //     // Function Call
    //     Fibonacci(N, num1, num2);
    // }
}
