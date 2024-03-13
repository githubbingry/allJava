package CodeForces.Contest1926;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt(), n = 0;
        // int[] count = new int[n];
        int[][] ar;
        while (t-- > 0) {
            n = x.nextInt();
            ar = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    ar[i][j] = x.nextInt();
                }
            }

            
        }
        x.close();
    }
}
