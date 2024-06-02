package Buat_Soal;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerSum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println(sumOfPower1(10));
        System.out.println(sumOfPower2(10));
        System.out.println(sumOfPower3(10));
        System.out.println(doubleSeriesSolutionSumOfPower(10, 3));
        x.close();
    }

    static BigInteger doubleSeriesSolutionSumOfPower(int n, int p) { //n banyak iterasi, p pangkat
        BigInteger nol = BigInteger.ZERO, satu = BigInteger.ONE;
        BigInteger ns, imj, k1, k2, s = nol;
        for(int i = 1; i <= p; i++){
            for(int j = 0; j <= i-1; j++){
                ns = j % 2 == 0 ? satu : satu.negate();
                imj = BigInteger.valueOf(i-j).pow(p);
                k1 = binomial(n+p-i+1, n-i);
                k2 = binomial(p+1, j);
                s = s.add(ns.multiply(imj).multiply(k1).multiply(k2));
                // System.out.println(ns+" "+imj+" "+k1+" "+k2);
            }
        }
        return s;
    }

    /*
        nCk = n!/(k!(n-k)!)
        artinya n*(n-1).. sebanyak k lalu dibagi k!
        atau bentuk lain yaitu :
        PI from i = 0 to k of ((n-i)/(i+1))
     */
    static BigInteger binomial(final int N, final int K) {
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf(N-k)).divide(BigInteger.valueOf(k+1));
        }
        return ret;
    }

    static BigInteger sumOfPower1(int n){
        return BigInteger.valueOf(n*(n+1)/2);
    }

    static BigInteger sumOfPower2(int n){
        return BigInteger.valueOf(n*(n+1)*(2*n+1)/6);
    }

    static BigInteger sumOfPower3(int n){
        return BigInteger.valueOf((int)Math.pow(n*(n+1)/2, 2));
    }
}
