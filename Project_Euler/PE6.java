package Project_Euler;

public class PE6 {
    public static void main(String[] args) {
        diff(100);
    }

    static int square(int a){
        return (int)Math.pow(a, 2);
    }

    static int sumSquare(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += square(i);
        }
        return sum;
    }

    static int squareSum(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum += i;
        }
        return square(sum);
    }

    static void diff(int num){
        int a = squareSum(num);
        int b = sumSquare(num);
        System.out.println(a - b);
    }
}
