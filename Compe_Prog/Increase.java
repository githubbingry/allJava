package Compe_Prog;

import java.util.Scanner;

public class Increase {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int number[]=new int[n];
        int a=0;
        for(int i=0;i < n;i++){
            number[i]=x.nextInt();
        }
        for(int i=0;i < n;i++){
            if (number[n-1]>number[n-i-1]){
                a++;
            }
        }
        System.out.println(a);
        x.close();
    }
}
