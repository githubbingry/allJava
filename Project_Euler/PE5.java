package Project_Euler;

public class PE5 {
    public static void main(String[] args) {
        int num = 20;
        int product = productOfPrime(num);
        System.out.println(smallestDivisible(num, product));
    }

    static boolean isPrime(int a){
        if (a < 2) return false;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0) return false;
        }
        return true;
    }

    static int productOfPrime(int a){
        int sum = 1;
        for (int i = 2; i <= a; i++){
            if(isPrime(i)){
                sum *= i;
            }
        }
        return sum;
    }

    static boolean evenlyDivisible(int num, int product){
        for (int i = 3; i <= num; i++){
            if (product % i != 0) return false;
        }
        return true;
    }

    static int smallestDivisible(int num, int product){
        while(true){
            if(evenlyDivisible(num, product)){
                break;
            }
            product++;
        }
        return product;
    }
}

/*
2520= 210 * 12
    = (2*3*5*7) * (4*3)
    = 7*4*9*10


 */