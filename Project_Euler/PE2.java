package Project_Euler;

public class PE2 {
    public static void main(String[] args) {
        long memo[] = new long[100];
        memo[0] = 1; memo[1] = 2;
        fib(memo);
        int indeks = checkIndex4mil(memo);
        System.out.println(sumEvenFib(memo, indeks));
        // System.out.println(memo[31]);
        // System.out.println(memo[32]);
    }

    static long[] fib(long[] memo){
        for (long i = 2; i < memo.length; i++){
            memo[(int)i] = memo[(int)i-1] + memo[(int)i-2];
        }
        return memo;
    }

    static int checkIndex4mil(long[] memo){
        int indeks = 0;
        for (int i = 30; i < memo.length; i++){
            if (memo[i] > 4000000){
                indeks = i;
                break;
            }
        }
        return indeks;
    }

    static boolean isEven(long a){
        if (a % 2 == 0) return true;
        return false;
    }

    static long sumEvenFib(long[] memo, int indeks){
        long sum = 0;
        for (long i = 0; i < indeks; i++){
            if(isEven(memo[(int)i])){
                sum += memo[(int)i];
            }
        }
        return sum;
    }
}
