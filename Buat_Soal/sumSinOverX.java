package Buat_Soal;

import java.util.Scanner;

public class sumSinOverX {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt(), m, n, d;
        double a;
        while(t-- > 0){
            m = x.nextInt();
            d = 1 + 8*m;
            if(d < 0){
                System.out.println("NaN");
            } else if((a = Math.sqrt(d)) % 1 == 0){
                if(m == 0) {
                    System.out.println("No Solution");
                    continue;
                }
                n = (-1 + (int)a)/2;
                System.out.println(n);
            } else System.out.println("No Solution");
        }
        x.close();
    }
}
/*
lim x->0 (sigma(k = 1 to n) (sin(kx)/x)) = m
lim x->0 sin(x)/x + lim x->0 sin(2x)/x + ... + lim x->0 sin(nx)/x= m
1 + 2 + ... + n = m
n(n+1)/2 = m
n^2 + n - 2m = 0
D = 1 + 8m
n = (-1 + sqrt(1 + 8m))/2
 */