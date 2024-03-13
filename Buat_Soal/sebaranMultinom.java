package Buat_Soal;

public class sebaranMultinom {
    public static void main(String[] args) {
        /*
        misal k = 3
        x1 = 2, x2 = 1, x3 = 3
        p1 = 2/9, p2 = 1/6, p3 = 11/18
        n = 6
        hasil sebaran multinom 0.1127
         */
        int[] xAr = {2, 1 ,3};
        double[] pAr = {(double)2/9, (double)1/6, (double)11/18};
        int n = 6;
        System.out.println(f(xAr, pAr, n));
    }

    public static double f(int[] xAr, double[] pAr, int n){
        //karena k = banyak jumlah x atau p maka :
        double result = factorial(n);
        for (int i = 0; i < (int)xAr.length; i++){
            result *= Math.pow(pAr[i], xAr[i])/factorial(xAr[i]);
            System.out.printf("ke %d pAr %f xAr %d result %f\n", i+1, pAr[i], xAr[i], result);
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
