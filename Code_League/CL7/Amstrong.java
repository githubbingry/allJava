package Code_League.CL7;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String n = x.next();
        int a = Integer.parseInt(n);
        int result = 0;
        for (int i = n.length(); i>0 ; i--){
            result += (int)Math.pow(a/(int)Math.pow(10,i-1)%10,n.length());
        }
        if (result == a)
            System.out.println("YA");
        else
            System.out.println("BUKAN");
        x.close();
    }
}