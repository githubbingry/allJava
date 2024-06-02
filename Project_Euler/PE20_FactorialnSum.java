package Project_Euler;

import java.math.BigInteger;
import java.util.Scanner;

public class PE20_FactorialnSum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        BigInteger s = new BigInteger(x.next());
        BigInteger fac = factorial(s);
        System.out.println(fac);
        System.out.println(sumArr(fac));
        x.close();
    }

    static BigInteger factorial(BigInteger n){
        BigInteger satu = BigInteger.ONE, dua = BigInteger.TWO;
        BigInteger sum = satu;
        if(n.compareTo(satu) > 0){
            for(BigInteger i = dua; i.compareTo(n) <= 0; i = i.add(satu)){
                sum = sum.multiply(i);
            }
        }
        return sum;
    }

    static int sumArr(BigInteger n){
        int sum = 0;
        for (int i = 0; i < n.toString().length(); i++){
            sum += Integer.parseInt(n.toString().substring(i, i+1));
        }
        return sum;
    }
}
