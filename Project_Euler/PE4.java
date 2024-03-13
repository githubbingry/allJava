package Project_Euler;

/*
2143883412 = 999997 x 997290 (6 digit)
1293663921 = 99994 x 92902 (5 digit)
99000099 = 9999 x 9901 (4 digit)
906609 = 995 x 583 (3 digit)
9009 = 99 x 91 (2 digit)
 */

public class PE4 {
    public static void main(String[] args) {
        int indeksI = 0, indeksJ = 0, max = 0;
        for (int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                int hasilKali = i * j;
                if (isPalindrome(hasilKali)){
                    max = (max > hasilKali) ? max : hasilKali;
                    indeksI = i;
                    indeksJ = j;
                }
            }
        }
        System.out.printf("%d = %d x %d", max, indeksI, indeksJ);
    }

    static int checkDigit(int a){
        int sum = 0;
        while (a != 0){
            a /= 10;
            sum++;
        }
        return sum;
    }

    static boolean isPalindrome(int a){
        int digit = checkDigit(a);
        int d0 = 0, d1 = 0;
        for (int i = 0; i < digit / 2; i++){
            d0 = a / (int)(Math.pow(10, i)) % 10;
            d1 = a / (int)(Math.pow(10, digit - i - 1)) % 10;
            if (d0 != d1) return false;
        }
        return true;
    }
}
