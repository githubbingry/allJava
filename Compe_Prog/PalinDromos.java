package Compe_Prog;

import java.util.Scanner;

public class PalinDromos {

    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
            String masukan = x.nextLine();
            char[] data = masukan.toCharArray();
            boolean palindrom = true;
                for (int test2 = 0 ; test2 < data.length ; test2++) {
                    if (data[test2] != data[data.length - test2 - 1]) {
                        palindrom = false;
                    }
                }
                if(palindrom)
                System.out.println("Palindrome !");
                else
                System.out.println("Bukan Palindrome !");
        x.close();
    }
}