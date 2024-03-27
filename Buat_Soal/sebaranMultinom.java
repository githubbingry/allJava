package Buat_Soal;

import java.util.Scanner;

public class SebaranMultinom {
    public static void main(String[] args) {
        /*
        misal k = 3
        x1 = 2, x2 = 1, x3 = 3
        p1 = 2/9, p2 = 1/6, p3 = 11/18
        n = 6
        hasil sebaran multinom 0.1127
         */

        // int[] xAr = {2, 1 ,3};
        // double[] pAr = {(double)2/9, (double)1/6, (double)11/18};
        // int n = 6;
        // System.out.println(sebaranMultinom(xAr, pAr, n));
        // System.out.println();
        // System.out.println(sebaranMultinomString("2, 1, 3; 0.2222222, 0.1666667, 0.6111111; 6"));
        // System.out.println();
        // System.out.println(sebaranMultinomString("2, 1, 3; 2/9, 1/6, 11/18; 6"));
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        x.nextLine();
        String s;
        while(t-- > 0){
            s = x.nextLine();
            System.out.println(sebaranMultinomString(s));
        }
        x.close();
    }

    public static double sebaranMultinom(int[] xAr, double[] pAr, int n){
        // System.out.printf("sebaranMultinom(xAr, pAr, n)\n");
        //karena k = banyak jumlah x atau p maka :
        double result = factorial(n);
        for (int i = 0; i < (int)xAr.length; i++){
            result *= Math.pow(pAr[i], xAr[i])/factorial(xAr[i]);
            // System.out.printf("ke %d pAr %f xAr %d result %f\n", i+1, pAr[i], xAr[i], result);
        }
        return result;
    }

    public static double sebaranMultinomString(String s){
        // System.out.printf("sebaranMultinomString(%s)\n",s);
        //inputan string untuk x p dan n:
        String[] sAr = new String[3];
        sAr = s.trim() // trim whitespace front and back
        .replaceAll(" ", ""). // erase all whitespace
        split(";"); //split to 3 string for each x p n

        //sAr[0] untuk xAr
        String[] sXAr = sAr[0].split(",");
        int[] xAr = new int[sXAr.length];
        for(int i = 0; i < sXAr.length; i++){
            xAr[i] = Integer.parseInt(sXAr[i]);
        }

        //sAr[1] untuk pAr
        String[] sPAr = sAr[1].split(",");
        double[] pAr = new double[sPAr.length];
        String[] temp = new String[2];
        
        for(int i = 0; i < sPAr.length; i++){
            if(sPAr[i].startsWith("0.")){
                pAr[i] = Double.parseDouble(sPAr[i]);
            }else{
                temp = sPAr[i].split("/");
                pAr[i] = Double.parseDouble(temp[0])/Double.parseDouble(temp[1]);
            }
        }

        //sAr[2] untuk n
        int n = Integer.parseInt(sAr[2]);
        double result = factorial(n);

        for (int i = 0; i < (int)xAr.length; i++){
            result *= Math.pow(pAr[i], xAr[i])/factorial(xAr[i]);
            // System.out.printf("ke %d pAr %f xAr %d result %f\n", i+1, pAr[i], xAr[i], result);
        }
        return result;
    }

    static int factorial(int a){
        int sum = 1;
        for (int i = 2; i <= a; i++){
            sum *= i;
        }
        return sum;
    }
}
