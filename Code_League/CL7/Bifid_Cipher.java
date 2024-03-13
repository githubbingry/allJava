package Code_League.CL7;

import java.util.Scanner;

public class Bifid_Cipher {
    public static void main(String[] args) {
        char[][] karakter = {{'B','G','W','K','Z'},
                        {'Q','P','N','D','S'},
                        {'I','O','A','X','E'},
                        {'F','C','L','U','M'},
                        {'T','H','Y','V','R'}};
        Scanner x = new Scanner(System.in);
        String awal = x.next();
        char[] awalChar = new char[awal.length()];
        for (int i = 0; i < awal.length(); i++){
            awalChar[i] = awal.charAt(i);
        }
        System.out.println(karakter);
        x.close();
    }
}
