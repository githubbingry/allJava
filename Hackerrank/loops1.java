package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i ;
        for (i=1;i<=10;i++){
            int result = N*i;
            System.out.println(N+" x "+i+" = "+result);
        }
        bufferedReader.close();
    }
}
