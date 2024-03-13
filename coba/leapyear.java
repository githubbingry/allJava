package coba;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int year = x.nextInt();
        String isLeapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) ? "leapyear" : "not leapyear";
        System.out.println("year "+year+" is "+isLeapYear);
        x.close();
    }
}
