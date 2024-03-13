package Code_League.CL_8;

import java.util.Scanner;

public class Provider {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String num = x.next();
        int n08 = (num.charAt(2)-48)*10 +num.charAt(3)-48;
        int n628 = (num.charAt(3)-48)*10 +num.charAt(4)-48;
        if (num.charAt(0)-48 == 0){
            if (n08 <= 15) System.out.println("Telkomsel");
            else if (n08 <= 19) System.out.println("Indosat");
            else if (n08 <= 23) System.out.println("XL");
            else if (n08 <= 29) System.out.println("Tri");
            else if (n08 <= 53) System.out.println("AS");
            else if (n08 <= 88) System.out.println("Smartfren");
        } else{
            if (n628 >= 81) System.out.println("Smartfren");
            else if (n628 >= 52) System.out.println("AS");
            else if (n628 >= 27) System.out.println("Tri");
            else if (n628 >= 21) System.out.println("XL");
            else if (n628 >= 16) System.out.println("Indosat");
            else if (6208 >= 11) System.out.println("Telkomsel");
        }
        x.close();
    }
}
