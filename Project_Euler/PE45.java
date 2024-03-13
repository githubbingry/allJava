package Project_Euler;

import java.util.Scanner;

public class PE45 {

/*
Triangluar Number T(n)= n(n+1)/2
Pentagonal Number P(n) = n(3n-1)/2
Hexagonal Number H(n) = n(2n -1)

T(a) = P(b) = H(c)

T(1) = 1
P(1) = 1
H(1) = 1

T(285) = 40755
P(165) = 40755
H(143) = 40755

T(55385) = 1533776805
P(31977) = 1533776805
H(27693) = 1533776805

T(10744501) = 57722156241751
P(6203341) = 57722156241751
H(5372251) = 57722156241751
 */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong();
        TPHNumber(n);
        x.close();
    }
    
    static long triangularNumber(long num){
        return num*(num+1)/2;
    }

    static long pentagonalNumber(long num){
        return num*(3*num-1)/2;
    }

    static long hexagonalNumber(long num){
        return num*(2*num-1);
    }

    static void TPHNumber(long a){
        long t = 0, p = 1, h = 2;
        long b = 0, c = 0;
        //long batas = 1000000000, A = a;
        while(t != p || t != h || p != h){
            b = (1 + (int)Math.sqrt(1+12*a*(a+1)));
            c = (1+(int)Math.sqrt(2+4*a*(a+1)));
            if (b % 6 == 0 && c % 4 == 0){
                b /= 6;
                c /= 4;
                t = triangularNumber(a);
                p = pentagonalNumber(b);
                h = hexagonalNumber(c);
            }
            a++;
            // if(a- A == batas) break;
        }
        System.out.printf("T(%d) = %d\nP(%d) = %d\nH(%d) = %d\n", a-1, t, b, p, c, h);
    }
}
