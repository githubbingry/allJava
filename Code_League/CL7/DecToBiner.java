package Code_League.CL7;

import java.util.Scanner;

public class DecToBiner {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), temp;
        
        // temp = Integer.parseInt(Integer.toBinaryString(n));
        // System.out.println(temp);

        String binary = "";
        while (n != 0) {
            temp = n % 2 ;
            binary = temp + binary;
            n /= 2;
        }
        System.out.println(binary);
        x.close();
    }
}
