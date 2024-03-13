package coba;

import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        char grade ;
        double score= x.nextDouble() ;
        if (score >= 60.0 && score < 70)
        grade = 'D';
        else if (score >= 70.0 && score < 80)
        grade = 'C';
            else if (score >= 80.0 && score < 90)
        grade = 'B';
        else if (score >= 90.0)
        grade = 'A';
        else
        grade = 'F';

        System.out.println(grade);
        x.close();
    }
}
