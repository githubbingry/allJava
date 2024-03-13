package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int a=0, pos=0, neg=0, total=0;
        double n=0;
        do{
            a = x.nextInt();
            total+=a;
            if (a>0) pos++;
            else if (a<0) neg++;
            else break;
            n++;
        } while(x.hasNext());
        x.close();
        if(n==0){
            System.out.println("No numbers are entered except 0");
            return;
        } else {
            System.out.println("The number of positives is "+pos);
            System.out.println("The number of negatives is "+neg);
            System.out.println("The total is "+total);
            System.out.println("The average is "+(total/(n-1)));
        }
    }
}
