package Project_Euler;

public class PE7 {
    public static void main(String[] args) {
        int num = 10001, i = 2;
        while(num != 0){
            if (isPrime(i)){
                num--;
            }
            i++;
        }
        System.out.println(--i);
    }

    static boolean isPrime(int a){
        if (a < 2) return false;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0) return false;
        }
        return true;
    }
}
