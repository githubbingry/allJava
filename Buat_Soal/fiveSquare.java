package Buat_Soal;

import java.util.Scanner;

/*
some fun math problem
https://www.youtube.com/watch?v=U1mXWZs5UDE&t=112s&ab_channel=AndyMath
*/

public class fiveSquare{
    // public static void main(String[] args) {
    //     Scanner x = new Scanner(System.in);
    //     double t = x.nextInt(), n = 0;
    //     // ,a = 0, b = 0, c = 0;
    //     // double[] area = new double[(int)t];
    //     while(t--!=0){
    //         // n = x.nextInt();

    //         //with n a b c
    //         // a = n*4/13;
    //         // b = a*3/4;
    //         // c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

    //         //with n c
    //         // c = Math.sqrt(Math.pow(n*4/13, 2)+Math.pow(n*3/13, 2));

    //         //with n
    //         // area[(int)(area.length-t-1)] = Math.pow(Math.sqrt(Math.pow(n*4/13, 2)+Math.pow(n*3/13, 2)), 2)*4;

    //         //pure one line
    //         System.out.println((int)Math.floor(Math.pow(Math.sqrt(Math.pow((n = x.nextInt())*4/13, 2)+Math.pow(n*3/13, 2)), 2)*4));
    //     }
    //     // for(int i = 0; i < area.length; i++){
    //     //     // System.out.println(area[i]);
    //     //     System.out.println((int)Math.floor(area[i]));
    //     // }
    //     x.close();
    // }

    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            for(double t = x.nextInt(), n = 0; t-- != 0; System.out.println((int)Math.floor(Math.pow(Math.sqrt(Math.pow((n = x.nextInt())*4/13, 2)+Math.pow(n*3/13, 2)), 2)*4)));
        }
    }
}