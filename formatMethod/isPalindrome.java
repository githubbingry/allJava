package formatMethod;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(isPalindrome1(n) + " " + isPalindrome2(n));
        x.close();
    }

    public static boolean isPalindrome1(long n){ // count digit using convert int to string
        String ns = Integer.toString((int)n);
        for (long i = 0; i < ns.length(); i++){
            long temp1 = n / (int)(Math.pow(10, i)) %10;
            long temp2 = n / (int)(Math.pow(10, ns.length()-i-1)) %10;
            if (temp1 != temp2) return false;
        }
        return true;
    
    }
    public static boolean isPalindrome2(long n){ //count digit manually
        long countDigit = 0, temp = n;
        do {
            countDigit++;
            temp /= 10;
        } while (temp != 0);
        for (long i = 0; i < countDigit; i++){
            long temp1 = n / (int)(Math.pow(10, i)) %10;
            long temp2 = n / (int)(Math.pow(10, countDigit-i-1)) %10;
            if (temp1 != temp2) return false;
        }
        return true;
    }
}
