package Code_League.CL_1_2024;
import java.util.Scanner;

public class PolaRahasia {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        int n = x.nextInt(), c = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = x.nextInt();
        }
        a = sort(a);
        int t;
        for(int i = 0, j = 0; i < n; i++){
            if(a[i] % 2 != 0){
                b[j] = a[i];
                c++;
                j++;
            }
        }
        for(int i = 0; i < c; i++){
            if(i == c/2-1){
                t = b[i];
                b[i] = b[i+1];
                b[i+1] = t;
            }
            System.out.print(b[i] + " ");
        }
        x.close();
    }

    static int[] sort(int[] ar){
        int temp = 0;
        for(int i = 0; i < ar.length-1; i++){
            for(int j = ar.length-1; j > i; j--){
                if(ar[j] > ar[j-1]){
                    temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }
    
}
