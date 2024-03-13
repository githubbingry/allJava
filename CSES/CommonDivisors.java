package CSES;

import java.util.Scanner;

public class CommonDivisors {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), arr[] = new int[n], gcd = 0, temp = 0;
        for (int i = 0; i < n; i++){
            arr[i] = x.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == 0) temp = arr[i];
                if (i != j && arr[j] % temp == 0){
                    gcd = (temp > gcd) ? temp : gcd;
                    temp = (temp < arr[j]) ? temp : arr[j];
                    break;
                }
            }
        }
        System.out.println(gcd);
        x.close();
    }
}
