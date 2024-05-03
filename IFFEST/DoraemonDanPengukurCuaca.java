package IFFEST;

import java.util.Scanner;

public class DoraemonDanPengukurCuaca {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int t = x.nextInt();
        double m = 0, sd = 0;
        double[] a = new double[t];
        isi1(a);
        for(int i = 0; i < a.length; i++){
            m += a[i]/t;
        }
        for(int i = 0; i < a.length; i++){
            sd += Math.pow(a[i]-m, 2)/(t-1);
        }
        System.out.printf("%.2f %.2f", m, Math.sqrt(sd));
    }

    static void isi1(double[] A){
        for(int i = 0; i < A.length; i++){
            A[i] = x.nextDouble();
        }
    }
    static void isi2(double[][] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = x.nextDouble();
            }
        }
    }
}
