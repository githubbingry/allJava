package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_11 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter month in number from 1-12: ");
        int month = x.nextInt();
        if(month>12||month<1)
        main(args);
        System.out.println("Enter year in number: ");
        int year = x.nextInt();

        String monthName = "";
        switch (month){
            case 1 : monthName="January";
            break;
            case 2 : monthName="February";
            break;
            case 3 : monthName="March";
            break;
            case 4 : monthName="April";
            break;
            case 5 : monthName="May";
            break;
            case 6 : monthName="June";
            break;
            case 7 : monthName="July";
            break;
            case 8 : monthName="August";
            break;
            case 9 : monthName="September";
            break;
            case 10 : monthName="October";
            break;
            case 11 : monthName="November";
            break;
            case 12 : monthName="December";
        }

        int day = (month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12)? 31
        :(month==4 ||month==6 ||month==9 ||month==11) ? 30
        :(month==2 && (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0))) ? 29
        : 28;

        System.out.println(monthName+" "+year+" had "+day+" days");
        // System.out.printf("%d %d had %d days",monthName,year,day);
        x.close();
    }
}
