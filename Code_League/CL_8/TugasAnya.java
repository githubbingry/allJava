package Code_League.CL_8;

import java.util.Scanner;

public class TugasAnya {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        int count = 0;
        char c = x.next().charAt(0);
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c) count++;
        }
        System.out.println(count);
        x.close();
    }
}
