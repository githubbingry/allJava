package CSES.unsolved;

import java.util.Scanner;

public class JosephusQueries {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long q = x.nextLong();
        for (int i = 0; i < q; i++){
            long k = x.nextLong(), n = x.nextLong();
            if (n*2 > k && k % 2 == 0) System.out.println(n*2 - k + 1);
            else if (n*2 > k && k % 2 == 1) System.out.println(n*2 - k);
            else System.out.println(n*2);
        }
        x.close();
    }
}
