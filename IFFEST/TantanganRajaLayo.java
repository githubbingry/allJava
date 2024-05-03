package IFFEST;

import java.util.Scanner;

public class TantanganRajaLayo {
    public static int getAns(int n) {
        int ans = 0;
        ans += n / 19;
        n %= 19;
        ans += n / 17;
        n %= 17;
        ans += n / 13;
        n %= 13;
        ans += n / 11;
        n %= 11;
        ans += n / 7;
        n %= 7;
        ans += n / 5;
        n %= 5;
        ans += n / 3;
        n %= 3;
        ans += n / 2;
        n %= 2;
        ans += n;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testcases = in.nextInt();
        for (int i = 1; i <= testcases; i++) {
            int n = in.nextInt();
            if (n < 2) {
                System.out.println(getAns(n));
            } else if (n < 3) {
                System.out.println(Math.min(getAns(n), getAns(n - 2) + 1));
            } else if (n < 5) {
                System.out.println(Math.min(Math.min(getAns(n), getAns(n - 2) + 1), getAns(n - 3) + 1));
            } else if (n < 7) {
                System.out.println(Math.min(Math.min(Math.min(getAns(n), getAns(n - 2) + 1), getAns(n - 3) + 1), getAns(n - 5) + 1));
            } else if (n < 11) {
                System.out.println(Math.min(Math.min(Math.min(Math.min(getAns(n), getAns(n - 2) + 1), getAns(n - 3) + 1), getAns(n - 5) + 1), getAns(n - 7) + 1));
            } else if (n < 13) {
                System.out.println(Math.min(Math.min(Math.min(Math.min(Math.min(getAns(n), getAns(n - 2) + 1), getAns(n - 3) + 1), getAns(n - 5) + 1), getAns(n - 7) + 1), getAns(n - 11) + 1));
            } else if (n < 17) {
                System.out.println(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(getAns(n), getAns(n - 2) + 1), getAns(n - 3) + 1), getAns(n - 5) + 1), getAns(n - 7) + 1), getAns(n - 11) + 1), getAns(n - 13) + 1));
            } else if (n < 19) {
                System.out.println(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(getAns(n), getAns(n - 2) + 1), getAns(n - 3) + 1), getAns(n - 5) + 1), getAns(n - 7) + 1), getAns(n - 11) + 1), getAns(n - 13) + 1), getAns(n - 17) + 1));
            } else {
                System.out.println(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(getAns(n), getAns(n - 2) + 1), getAns(n - 3) + 1), getAns(n - 5) + 1), getAns(n - 7) + 1), getAns(n - 11) + 1), getAns(n - 13) + 1), getAns(n - 17) + 1), getAns(n - 19) + 1));
            }
        }
        in.close();
    }
}