package coba;

import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int numb1 = x.nextInt();
        int numb2 = x.nextInt();
        int numb3 = x.nextInt();

        // numb1 = numb1 + numb2;
        // numb2 = numb1 - numb2;
        // numb1 = numb1 - numb2;

        // numb1 = numb1 ^ numb2;
        // numb2 = numb1 ^ numb2;
        // numb1 = numb1 ^ numb2;
        
        numb1 = numb1 ^ numb2 ^ numb3;
        numb2 = numb1 ^ numb2 ^ numb3;
        numb1 = numb1 ^ numb2 ^ numb3;
        
        numb2 = numb1 ^ numb2 ^ numb3;
        numb3 = numb1 ^ numb2 ^ numb3;
        numb2 = numb1 ^ numb2 ^ numb3;
        
        numb1 = numb1 ^ numb2 ^ numb3;
        numb2 = numb1 ^ numb2 ^ numb3;
        numb1 = numb1 ^ numb2 ^ numb3;

        // sama dengan
        // numb1 = numb1 ^ numb3 ;
        // numb3 = numb1 ^ numb3 ;
        // numb1 = numb1 ^ numb3 ;
        
        System.out.printf("%d , %d , %d",numb1,numb2,numb3);
        x.close();
    }
}
