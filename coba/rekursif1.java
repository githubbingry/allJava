package coba;

import java.util.Scanner;

public class rekursif1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        Long n = x.nextLong();
        x.close();
        if (n<0){
            n*=-1;
            System.out.println(add(n)*-1);
        } else
        System.out.println(add(n));
        System.out.println();
    }

    static Long add(Long n){
        if (n==0){
            return 0l;
        }
        if (n<0)
            return n+add(n+1);
        else if (n>0)
            return n+add(n-1);
        return n;
    }
}

