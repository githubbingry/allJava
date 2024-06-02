package coba;

import java.util.Scanner;

public class ternaryVoid {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // boolean a = x.nextBoolean();
        // System.out.println(a);
        // System.out.println(a ? doFunc1(): doFunc2());
        // System.out.println(a ? do1(): do2());
        int a = x.nextInt();
        (a > 0? new runningVoid(a): new runningVoid(a)).run();
        x.close();
    }

    static void doVoid1(){
        System.out.print("ayam");
    }

    static Void do1(){
        doVoid1();
        return null;
    }

    static String doFunc1(){
        doVoid1();
        return "";
    }
    
    static Void do2(){
        doVoid2();
        return null;
    }

    static void doVoid2(){
        System.out.print("kecap");
    }

    static String doFunc2(){
        doVoid2();
        return "";
    }
}

class runningVoid implements Runnable {
    private int a;
    public runningVoid(int a){
        this.a = a;
    }

    public void run(){
        String t = String.valueOf(this.a);
        System.out.println(t.length());
    }
}
