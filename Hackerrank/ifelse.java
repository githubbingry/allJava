package Hackerrank;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 0 ;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        a=N%2;
        if (a==1){
            System.out.println("Weird");
        } else if (N>=2 && N<=5){
            System.out.println("Not Weird");
        } else if (N>=6 && N<=20){
            System.out.println("Weird");
        } else if (N>=20){
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
