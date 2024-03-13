package coba;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        piramidString1(s);
        // piramidString2(s);
        x.close();
    }

    static void piramidString1(String s){
        for(int i = 0; i <= s.length(); i++){
            System.out.println(s.substring(0, i));
        }
        for(int i = s.length()-1; i >= 0; i--){
            System.out.println(s.substring(0, i));
        }
    }

    static void piramidString2(String s){
        for(int i = s.length()-1; i >= 0; i--){
            System.out.println(s.substring(i));
        }
        for(int i = 1; i < s.length(); i++){
            System.out.println(s.substring(i));
        }
    }
}
