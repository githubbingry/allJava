package Project_Euler.unsolved;

import java.math.BigInteger;

public class PE668 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("100");
        System.out.println(SquareRootSmooth(a));
        // System.out.println(isSquareRootSmooth(a));
        // System.out.println(maxPrimeFactor(a));
    }

    static boolean isPrimeFactor(BigInteger a, BigInteger i){
        if(i.isProbablePrime(10000000) && a.mod(i).equals(BigInteger.ZERO))
            return true;
        return false;
    }

    static BigInteger maxPrimeFactor(BigInteger a){
        BigInteger max = BigInteger.ZERO;
        for(BigInteger j = BigInteger.TWO; j.compareTo(a) < 0; j = j.add(BigInteger.ONE)){
            max = (isPrimeFactor(a, j) && max.compareTo(j) < 0) ? j : max;
        }
        return max;
    }

    static boolean isSquareRootSmooth(BigInteger i){
        for(BigInteger j = BigInteger.TWO; j.compareTo(i) < 0; j = j.add(BigInteger.ONE)){
            BigInteger k = i.sqrt();
            BigInteger max = maxPrimeFactor(j);
            if (max.compareTo(k) < 0) {
                return true;
            }
        }
        return false;
    }

    static BigInteger SquareRootSmooth(BigInteger a){
        BigInteger sum = BigInteger.ONE;
        for (BigInteger i = BigInteger.TWO; i.compareTo(a) < 0; i = i.add(BigInteger.ONE) ){
            if(isSquareRootSmooth(i)){
                sum = sum.add(BigInteger.ONE);
            }
        }
        return sum;
    }
}
