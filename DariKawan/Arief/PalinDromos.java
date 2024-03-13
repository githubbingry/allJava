package DariKawan.Arief;

import java.util.Scanner;

public class PalinDromos {

    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        String masukan = x.nextLine();
        char[] data = masukan.toCharArray();
        boolean palindrom = true;
        
        for (int i = 0 ; i < data.length ; i++) {
            if (data[i] != data[data.length - i - 1]) {
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