package DariKawan.Fazri.GenerateTestCase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Random;

public class TC_Gen { // baru bener untuk alternating sequence
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        BigInteger nol = BigInteger.ZERO, satu = BigInteger.ONE, dua= BigInteger.TWO;
        for (int i = 0; i < 31; i++) {
            String inputFileName = String.format("D:\\VSCode\\Java\\Sup\\src\\DariKawan\\Fazri\\GenerateTestCase\\input%02d.txt", i);
            String outputFileName = String.format("D:\\VSCode\\Java\\Sup\\src\\DariKawan\\Fazri\\GenerateTestCase\\output%02d.txt", i);
            PrintWriter inputFile = new PrintWriter(new FileWriter(inputFileName));
            PrintWriter outputFile = new PrintWriter(new FileWriter(outputFileName));

            int t = rand.nextInt(100) + 1; // banyak tc
            // int t = 1; // banyak tc
            inputFile.println(t);
            for (int j = 0; j < t; j++) {
                int n = rand.nextInt(1000) + 1; // banyak angka alternating
                BigInteger m = new BigInteger(10000, rand); // banyak loop
                inputFile.println(n + "\n" + m.toString());
                BigInteger sum = nol;
                BigInteger[] a = new BigInteger[n];
                BigInteger[] k = new BigInteger[n];
                BigInteger N = BigInteger.valueOf(n);
                for (int ki = 0; ki < n; ki++) {
                    a[ki] = new BigInteger(1000, rand); // input angka alternating
                    inputFile.println(a[ki].toString());
                    k[ki] = m.add(N).subtract(BigInteger.valueOf(ki)).subtract(satu).divide(N);
                    sum = sum.add(a[ki].multiply(k[ki]).multiply(k[ki].add(satu)).divide(dua));
                }
                outputFile.println(sum.toString());
            }

            inputFile.close();
            outputFile.close();

            System.out.println("Generated " + inputFileName + " and " + outputFileName);
        }
    }
}