package Probabilitas_Statistika;

import java.util.Scanner;

// 61+9+8+10+4+18+27+17+53+12+7+29+35+9+21+24+4+39+63+25+39+26+18+34+23+13+28+11+2+21+28+37+31+23+15+26+35+59+20+12+13+21+3+25+43+18+14+20+19+17

public class DataKelompok {
    static Scanner x = new Scanner(System.in);
    static Scanner xs = new Scanner(System.in);
    public static void main(String[] args) {
        int n = x.nextInt();
        double[] ar = new double[n];
        String[] sar = new String[n];
        sar = isiArStr(sar);
        // isiArD(ar);
        isiArDFromStr(ar, sar);
        System.out.println(mean(ar));
    }

    static String[] isiArStr(String[] sar){
        String s = xs.nextLine();
        sar = s.trim().split("\\+");
        return sar;
    }

    static void isiArD(double[] ar){
        for(int i = 0; i < ar.length; i++){
            ar[i] = x.nextDouble();
        }
    }

    static void isiArDFromStr(double[] ar, String[] sar){
        for(int i = 0; i < ar.length; i++){
            ar[i] = (double)Integer.parseInt(sar[i]);
        }
    }
    
    static double mean(double[] ar){
        double sum = 0.0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum / ar.length;
    }
}
