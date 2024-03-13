package Project_Euler;

public class PE1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++){
            if ((i % 3 == 0) || (i % 5 == 0)){
                sum += i;
            }
        }
        System.out.println(sum);


        sum = 0;
        int i = 0;
        while(++i < 10){
            if ((i % 3 == 0) || (i % 5 == 0)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
