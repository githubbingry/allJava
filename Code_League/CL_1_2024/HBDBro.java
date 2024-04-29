package Code_League.CL_1_2024;

import java.util.Scanner;

public class HBDBro {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        int n = x.nextInt(), m = -1, c = 0;
        int t;
        while(n-->0){
            t = x.nextInt();
            if(m < t){
                c = 1;
                m = t;
            } else if (m == t){
                c++;
            }
        }
        System.out.println(c);
        x.close();
    }
}
