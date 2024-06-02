package Project_Euler;

public class PE6 {
    public static void main(String[] args) {
        int n = 1000;
        diff(n);
        System.out.println(squareOfSumOfPower1(n) - sumOfPower2(n));
    }

    static int squareOfSumOfPower1(int n){
        return sumOfPower1(n)*sumOfPower1(n);
    }

    static int sumOfPower1(int n){
        return (n*(n+1)/2);
    }

    static int sumOfPower2(int n){
        return (n*(n+1)*(2*n+1)/6);
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
