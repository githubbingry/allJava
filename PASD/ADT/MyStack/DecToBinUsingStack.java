package PASD.ADT.MyStack;

import java.util.Scanner;
import java.math.BigInteger;

public class DecToBinUsingStack {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // int dec = x.nextInt();
        // System.out.println(decToBin(dec));
        // System.out.println(dec);

        String decBI = x.next(); //for big integer
        // System.out.println(decBI);
        System.out.println(decToBinBI(decBI));
        x.close();
    }

    static String decToBin(int dec){
        StackList bin = new StackList();
        while(dec != 0){
            bin.push(dec%2);
            dec /= 2;
        }
        String s = "";
        StackNode cur = bin.head;
        while(cur != null){
            s += cur.getValue();
            cur = cur.getNext();
        }
        return s;
    }

    static String decToBinBI(String dec){
        BigInteger nol = BigInteger.ZERO, dua = BigInteger.TWO;
        BigInteger decBI = new BigInteger(dec);
        StackList bin = new StackList();
        while(decBI.compareTo(nol) != 0){
            bin.push(decBI.mod(dua));
            decBI = decBI.divide(dua);
        }
        String s = "";
        StackNode cur = bin.head;
        while(cur != null){
            s += cur.getValueBI();
            cur = cur.getNext();
        }
        return s;
    }
}
