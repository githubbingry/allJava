package Buat_Soal;

import java.util.Scanner;

public class CollatzString {
    public static void main(String[] args) {
        /*
        f(x) = x/2, x even; 3x+1, x odd
        //TODO:beneri ini salah
         */
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        while(t-->0){
            functionProblem(x);
        }
        // String s = x.next();
        // char[] c = s.toCharArray();
        // int a = 2, i = 0, t = a;
        // char ca = ' ';
        // while (i != c.length-1) {
        //     if(t % 2 == 0){
        //         ca = 'e';
        //         t /= 2;
        //     } else {
        //         ca = 'o';
        //         t = 3*t+1;
        //     }
        //     System.out.println(t+" "+ca+" "+c[i]);
        //     //misal udud
        //     if(ca == c[i]){
        //         i++;
        //     } else {
        //         i = 0;
        //         t = a++;
        //         ca = ' ';
        //     }
        // }
        // System.out.println(a);
        x.close();
    }

    static void functionProblem(Scanner x){
        System.out.printf("%."+x.next()+"f" ,1.0/x.nextDouble()); //banyak digit dibelakang koma dan angka yng diinverse
    }
}
