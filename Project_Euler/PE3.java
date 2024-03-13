package Project_Euler;

public class PE3 {
    public static void main(String[] args) {
        long num = 600851475143l;
        System.out.println(largestPrimeFactor(num));
    }

    static boolean isPrime(int a){
        if (a < 2) return false;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0) return false;
        }
        return true;
    }

    static long largestPrimeFactor(long num){
        long max = 0;
        for (int i = 2; i <= num; i++){
            if (isPrime(i) && num % i ==0){
                max = i;
                num /= i;
                i -= 1;
            }
        }
        return max;
    }
}
