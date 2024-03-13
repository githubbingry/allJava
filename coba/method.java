package coba;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int max, num1 = x.nextInt(), num2 = x.nextInt();
        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(max(num1, num2));

        displayPrime(x);
        x.close();
    }

    static int max(int x, int y){
        return (x > y) ? x : y;
    }

    static int prima(int bilangan, int factor){
        for (int i=2; i<=bilangan; i++){
            if (bilangan % i == 0) factor ++;
            if (factor > 1) break;
        }
        return factor;
    }

    static void displayPrime(Scanner x){
        int bilangan = x.nextInt(), factor = 0;
        if (prima(bilangan, factor) > 1 || bilangan == 1)
            System.out.println("bukan prima");
        else
            System.out.println("prima");
    }
}
