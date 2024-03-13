package DariKawan.Andhika;

import java.util.Scanner;

public class Euler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int xKuadrat = (int)Math.pow(x, 2);
        double cosx = Math.cos(Math.toRadians(45));
        double euler = Math.exp(0.5);
        System.out.println(xKuadrat * cosx + euler);

        System.out.println(((int)Math.pow(x, 2)) * (Math.cos(Math.toRadians(45))) + Math.exp(0.5));
        scan.close();
    }
}
