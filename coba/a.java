package coba;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), m = x.nextInt(), mod = (int)4e5 + 69;

        // for (int i = n; i <= m * n; i += m){
        //     System.out.print((i ^ n ^ m) % mod + " ");
        // }
        // for (int i = n; i <= m * n--; i += m){
        //     System.out.print((i + n) % mod + " ");
        // }
        for (int i = n; i <= m * n--; i += m){
            System.out.print((i + n - m--) % mod + " ");
        }

        // int t = n = m = 10;
        // System.out.println(t);
        // System.out.println(n);
        // System.out.println(m);
        x.close();
    }
}
