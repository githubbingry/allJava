package Code_League.CL7;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), count = 0;
        int[] isi = new int[n];
        for (int i = 0; i < n; i++){
            isi[i] = x.nextInt();
        }
        
        System.out.println(count);
        x.close();
    }
}
