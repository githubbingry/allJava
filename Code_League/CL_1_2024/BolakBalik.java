package Code_League.CL_1_2024;

import java.util.Scanner;

public class BolakBalik {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        String s1 = x.next();
        String s2 = x.next();
        System.out.println(sort(s1).equals(sort(s2)) ?
        "True, " + s1 + " dan " + s2 + " adalah anagram." :
        "False, " + s1 + " dan " + s2 + " bukan anagram.");
        x.close();
    }

    static String sort(String s){
        char[] c = s.toCharArray();
        int temp = 0;
        for(int i = 0; i < c.length-1; i++){
            for(int j = c.length-1; j > i; j--){
                if((int)c[j] > (int)c[j-1]){
                    temp = (char)c[j-1];
                    c[j-1] = (char)c[j];
                    c[j] = (char)temp;
                }
            }
        }
        return String.copyValueOf(c);
    }
}
