package Buat_Soal;

import java.util.Scanner;

/*
f(x + y) = f(x) + f(y)
f(1) = a
f(7) = ?

f(1 + 1) = f(1) + f(1)
f(2) = 2*f(1)           = 2*a
f(4) = 2*f(2)           = 4*a
f(8) = 2*f(4)           = 8*a
...
f(n) = 2f(n/2)          = n*a
n = x + y
n*a = f(x) + f(y)

f(7) = 7*a
 */

public class functionalEquation {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long a = x.nextLong();
        System.out.println(7*a);
        x.close();
    }
}
