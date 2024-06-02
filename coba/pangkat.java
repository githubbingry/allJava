package coba;

import java.math.BigInteger;

public class pangkat {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1");
        for(int i = 0; i < 777; i++){
            b = b.multiply(BigInteger.valueOf(7));
        }
        System.out.println(b.toString());
    }
}
