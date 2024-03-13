package CSES.unsolved;

import java.util.Scanner;

public class PrimeMultiples {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong(), k = x.nextLong(), count = 0, maks = 0, j = 0;
        long[] prime = new long[(int)k], temp = new long[(int)k];
        for (long i = 0; i < k; i++){
            prime[(int)i] = x.nextLong();
            temp[(int)i] = n;
            if (i == 0) maks = n / prime[(int)i];
            else maks = (maks > n / prime[(int)i]) ? maks : n / prime[(int)i];
        }
        long[][] list = new long[(int)k][(int)maks];
        for (int i = 0; i < k; i++){
            if (n % prime[i] == 0){
                do{
                    count++;
                    temp[i] -= prime[i];
                    list[(int)j][i] = temp[i];
                }while (temp[i] != 0);
            }
            j++;
        }
        for (int p = 0; p < k ; p++){
            for (int q = 0; q < maks; q++){
                list[q][p] = 1;
            }
        }
        System.out.println(count);
        x.close();
    }
}
