package PASD.ADT.MyStack;

import java.math.BigInteger;

public class TestStackList {
    public static void main(String[] args) {
        StackList sl = new StackList();
        System.out.println(sl.isEmpty());
        
        sl.push(1);
        sl.push(9);
        sl.push(2);
        sl.push(6);
        sl.print();
        System.out.println(sl.peek());
        System.out.println(sl.getSize());
        System.out.println(sl.isEmpty());
        
        System.out.println();

        StackNode s1 = new StackNode(7);
        StackNode s2 = new StackNode(12);
        StackNode s3 = new StackNode(100);
        StackNode s4 = new StackNode(0);
        StackNode s5 = new StackNode(new BigInteger("99999999999999999"));
        
        sl.pop();
        sl.push(s4);
        sl.push(s1);
        sl.push(s5);
        sl.push(s3);
        sl.push(s2);
        sl.push(new BigInteger("12345678987654321234567876567898765432"));
        sl.push(new BigInteger("12345"));
        sl.print();
        System.out.println(sl.peek());
        System.out.println(sl.getSize());
        System.out.println(sl.isEmpty());
    }
}
