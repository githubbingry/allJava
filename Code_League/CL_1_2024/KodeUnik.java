package Code_League.CL_1_2024;

import java.util.Scanner;

public class KodeUnik {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            System.out.print((int)c[i]-1+" ");
        }
        x.close();
    }
}
