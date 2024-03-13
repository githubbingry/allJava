package formatMethod;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(isPrime1(n) + " " + isPrime2(n));
        x.close();
    }
    public static boolean isPrime1(int number){ // lebiih cepat
        for (int divisor = 2; divisor <= number / 2; divisor++)
            if (number % divisor == 0)
                return false;
        if (number < 2)
            return false;
        return true;
    }

    public static boolean isPrime2(int number){
        int factor = 0;
        for (int i = 2; i<=number; i++)
            if (number%i==0)
                factor++;
        if (factor != 1)
            return false;
        return true;
    }
}
