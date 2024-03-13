package Buat_Soal.fibonacci;

import java.util.Scanner;

public class fibonacciRequiem {
    /*
    2
    2 1 1 5
    2 1 1 5
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int q = x.nextInt();
        int j =-1;
        if (q < 1 || q > 51)
            System.out.println("out of range");
        else
            program(x, q, j);
        x.close();
    }

    static void program(Scanner x, int q, int j) {
        try {
            for (++j; j<q ;j++){
                int p = x.nextInt();
                if (p > 46 || p < 2){
                    System.out.println("out of range");
                    program(x, q, j++);;
                } else {

                    int[] initial = new  int[p];
                    inisialisasi(x, p, initial);
                    int n = x.nextInt()-1; //maks unknown, depends on input from user of a and b
                    display(n, p, initial);
                }
            }
        } catch (Exception e) {
            System.out.println("out of range");
            program(x, q, j);
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
        if (n < 0 || n > 46 || p < 2 || n < p)
            System.out.print("out of range");
        else {
            int result = 0;
            int [] memo = new int[n+1] ;
            for (int i = 0; i <= n ;i++){
                System.out.print(Fibonacci(p, i, result, memo, initial) + " ");
            }
        }
        System.out.println();
    }
}
