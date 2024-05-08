package DariKawan.Fazri.GenerateTestCase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Random;

public class TC_Gen_Kegagalan { //gagal karena ini untuk 2 n, tapi logic fail
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        for (int i = 0; i < 31; i++) {
            String inputFileName = String.format("D:\\VSCode\\Java\\Sup\\src\\DariKawan\\Fazri\\GenerateTestCase\\input%02d.txt", i);
            String outputFileName = String.format("D:\\VSCode\\Java\\Sup\\src\\DariKawan\\Fazri\\GenerateTestCase\\output%02d.txt", i);
            PrintWriter inputFile = new PrintWriter(new FileWriter(inputFileName));
            PrintWriter outputFile = new PrintWriter(new FileWriter(outputFileName));

            // int t = rand.nextInt(1000) + 1; // banyak tc
            int t = 10; // banyak tc
            inputFile.println(t);
            for (int j = 0; j < t; j++) {
                int n = rand.nextInt(1000) + 1; // banyak angka alternating
                BigInteger m = new BigInteger(100, rand); // banyak loop
                inputFile.println(n + "\n" + m);
                BigInteger sum = BigInteger.ZERO;
                for (int k = 0; k < n; k++) {
                    BigInteger a = new BigInteger(100, rand); // input angka alternating
                    BigInteger b = new BigInteger(100, rand); // input angka alternating
                    inputFile.println(a);
                    inputFile.println(b);
                    BigInteger K = m.add(BigInteger.valueOf(n)).subtract(BigInteger.valueOf(k))
                            .subtract(BigInteger.ONE).divide(BigInteger.valueOf(n));
                    HitungSequenceBigInteger hitung = new HitungSequenceBigInteger(K, a, b);
                    sum = sum.add(hitung.getSum());
                }
                outputFile.println(sum);
            }

            inputFile.close();
            outputFile.close();

            System.out.println("Generated " + inputFileName + " and " + outputFileName);
        }
    }
}

class HitungSequenceBigInteger {
    private BigInteger sum;

    public HitungSequenceBigInteger(BigInteger n, BigInteger a, BigInteger b) {
        BigInteger nol = BigInteger.ZERO, satu = BigInteger.ONE, dua = BigInteger.TWO;
        this.sum = nol;
        BigInteger odd = nol, even = nol, oddMultiply = nol, evenMultiply = nol;
        odd = n.add(satu).divide(dua);
        even = n.divide(dua);
        oddMultiply = a.multiply(odd).multiply(odd.add(satu)).divide(dua);
        evenMultiply = b.multiply(even).multiply(even.add(satu)).divide(dua);
        this.sum = oddMultiply.add(evenMultiply);
    }

    public BigInteger getSum() {
        return this.sum;
    }
}