package CSES;

import java.util.Scanner;

public class CountingDivisors {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        for (int i = 0; i < n; i++)
            System.out.println(countDiv(n, x));
        x.close();
    }

    public static int countDiv(int n, Scanner x){
        int num = x.nextInt(), count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;
        return count;
    }
}
