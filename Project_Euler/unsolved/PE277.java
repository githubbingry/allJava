package Project_Euler.unsolved;

import java.util.Scanner;

public class PE277 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        modifiedCollatzConjecture(n);
        x.close();
    }

    static void modifiedCollatzConjecture(int n){
        while (n > 1){
            if (n % 3 == 0){
                System.out.print("D");
                n /= 3;
            } else if (n % 3 == 1){
                System.out.print("U");
                n = (n*4 + 2)/3;
            } else{
                System.out.print("d");
                n = (n*2 -1)/3;
            }
        }
    }
}
