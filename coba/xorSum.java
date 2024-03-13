package coba;

import java.util.Scanner;

public class xorSum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 4 ^ 5;
        a = a ^ 1;
        System.out.println(a);
        int b = 4 ^ 5 ^ 1;
        System.out.println(b);
        int n = 5;
        args = new String[n];
        int i = 0; while (i < n){
            args[i++] = x.nextLine();
        }
        while (n-- > 0){
            System.out.println(args[n]);
        }
        x.close();
    }
}
