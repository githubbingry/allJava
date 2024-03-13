package Compe_Prog;

import java.util.Scanner;

public class Kemungkinan {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String masukan = x.nextLine();
        char[] data = masukan.toCharArray();
        int i = (int)Math.pow(data.length,2);
        System.out.println(i);
        x.close();
    }
}
