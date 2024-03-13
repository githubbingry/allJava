package coba;

import java.math.BigInteger;
import java.util.Scanner;

public class angkaTanpaNol{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        String start = x.next(), end = x.next();
        x.close();

        System.out.println(bruteForce(start, end));
        calculation(start, end);
    }

    static BigInteger hitungDigitBigInteger(BigInteger a){
        BigInteger nol = BigInteger.ZERO,
        satu = BigInteger.ONE,
        sum = nol,
        sepuluh = BigInteger.TEN;
        while(!a.equals(nol)){
            a = a.divide(sepuluh);
            sum = sum.add(satu);
        }
        return sum;
    }

    static BigInteger bruteForce(String start, String end){ // time complexity : O(N), hanya untuk 3 digit
        BigInteger s = new BigInteger(start), e = new BigInteger(end),
        nol = BigInteger.ZERO,
        satu = BigInteger.ONE,
        dua = BigInteger.TWO,
        sum = nol,
        sepuluh = BigInteger.TEN;

        for (BigInteger i = s ; i.compareTo(e) < 0; i = i.add(satu)){

            BigInteger d2 = i.divide(sepuluh).mod(sepuluh);
            BigInteger d3 = i.mod(sepuluh);
            
            boolean d2BukanNol = !d2.equals(nol);
            boolean d3BukanNol = !d3.equals(nol);
            boolean iGenap = i.mod(dua).equals(nol);
            
            if(d2BukanNol && d3BukanNol && iGenap){
                sum = sum.add(satu);
            }
        }

        return sum;
    }

    static BigInteger calculation(String start, String end){
        BigInteger s = new BigInteger(start), e = new BigInteger(end),
        nol = BigInteger.ZERO,
        satu = BigInteger.ONE,
        dua = BigInteger.TWO,
        empat = new BigInteger("4"),
        sum = nol,
        sepuluh = BigInteger.TEN,

        range = e.subtract(s),
        rangeGanjil = range.divide(dua),
        banyakDigit = hitungDigitBigInteger(range),
        digitPertama = range.divide(sepuluh.pow(banyakDigit.intValue()-1)),

        banyakAngkaBukanSatuan = range.divide(sepuluh),
        digitSatuan = range.mod(sepuluh);
        
        BigInteger banyakAngkaSatuan = digitPertama.multiply(empat);
        if (!digitSatuan.equals(nol)){
            banyakAngkaSatuan = digitPertama.multiply(empat.subtract(satu));
            for(BigInteger i = dua; i.compareTo(digitSatuan) <= 0; i = i.add(satu)){
                if(i.mod(dua).equals(nol))
                banyakAngkaSatuan = banyakAngkaSatuan.add(satu);
            }
        } else {
            banyakAngkaSatuan = digitPertama.multiply(empat);
        }

        sum = sum.add(banyakAngkaBukanSatuan).add(banyakAngkaSatuan);
        sum = rangeGanjil.subtract(sum);

        if(rangeGanjil.mod(dua).equals(nol))
            System.out.println(sum);
        else
            System.out.println(sum.subtract(satu));

        return sum;
    }
}