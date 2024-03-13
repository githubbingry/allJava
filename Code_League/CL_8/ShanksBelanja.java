package Code_League.CL_8;

import java.util.Scanner;

public class ShanksBelanja {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), count = 0;
        do {
            count++;
            if (n >= 100) n -= 100;
            else if (n >= 75) n -= 75;
            else if (n >= 50) n -= 50;
            else if (n >= 20) n -= 20;
            else if (n >= 10) n -= 10;
            else if (n >= 5) n -= 5;
            else if (n >= 2) n -= 2;
            else if (n >= 1) n -= 1;
        } while (n > 0);
        System.out.println(count);
        x.close();
    }
}
