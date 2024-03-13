package Code_League.CL_8;

import java.util.Scanner;

public class GaneshGerbong {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), ar[] = new int[n];
        for (int i = 0; i < n; i++){
            ar[i] = x.nextInt();
        }
        for (int i = n-1; i >= 0; i--){
            if (i != 0) System.out.print(ar[i]+",");
            else System.out.println(ar[i]);
        }
        x.close();
    }
}
