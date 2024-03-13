package Compe_Prog;
import java.util.Scanner;

public class KoinHaikal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] Koin = {1,5,10,25,50};
        int[] Cara = new int[30000];
        Cara[0]=1;
        for (int i = 0 ; i<5 ; i++) {
            for (int a = Koin[i] ; a<30000 ; a++){
                Cara[a] += Cara[a-Koin[i]];
            }
        }
        do{
            int p = x.nextInt();
            System.out.println(Cara[p]);
        }
        while(x.hasNext());
        x.close();
    }
}