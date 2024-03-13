package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter today's day : ");
        int day = x.nextInt();
        if (day<0){
            System.out.println("Please only input positive integer");
            main(args);
        }
        System.out.println("Enter the number of days elapsed since today : ");
        int elapsed_days = x.nextInt();
        String today_day = "";
        String future_day = "";
        day %= 7;
        elapsed_days %= 7;
        
        switch(day){
            case 0 : today_day = "Sunday" ;
            break;
            case 1 : today_day = "Monday" ;
            break;
            case 2 : today_day = "Tuesday" ;
            break;
            case 3 : today_day = "Wednesday" ;
            break;
            case 4 : today_day = "Thursday" ;
            break;
            case 5 : today_day = "Friday" ;
            break;
            case 6 : today_day = "Saturday" ;
            break;
        }
        day += elapsed_days;
        day %= 7;
        if (day<0)
        day*= -1;
        
        switch(day){
            case 0 : future_day = "Sunday" ;
            break;
            case 1 : future_day = "Monday" ;
            break;
            case 2 : future_day = "Tuesday" ;
            break;
            case 3 : future_day = "Wednesday" ;
            break;
            case 4 : future_day = "Thursday" ;
            break;
            case 5 : future_day = "Friday" ;
            break;
            case 6 : future_day = "Saturday" ;
        }
        System.out.println("Today is " + today_day + " and the future day is " + future_day);
        x.close();
    }
}