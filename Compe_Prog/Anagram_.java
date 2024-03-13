package Compe_Prog;

import java.util.Scanner;

public class Anagram_ {
    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            String masukan = x.nextLine();
            char[] data1 = masukan.toCharArray();
            masukan = x.nextLine();
            char[] data2 = masukan.toCharArray();

            boolean anagram = true;
                for (int test2 = 0 ; test2 < data1.length ; test2++) {
                    if (data1[test2] != data2[test2]) {
                        anagram = false;
                    }
                }
                if(anagram)
                System.out.println("Anagram!");
                else
                System.out.println("Bukan Anagram!");
        x.close();
    }
}
