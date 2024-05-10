package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
    // Write your code here
        /*
        banyak step
        r = right, l = left, u = up, d = down
        ru = right up, and so on
        */
        int r = n-c_q;
        int l = c_q-1;
        int u = n-r_q;
        int d = r_q-1;
        int ru = Math.min(r, u);
        int lu = Math.min(l, u);
        int ld = Math.min(l, d);
        int rd = Math.min(r, d);
        int t = r+l+u+d+ru+lu+ld+rd;
        if (k == 0) return t;
        //cari obstacle yang paling mendekati queen, total dari 8 arah
        //buat menjadi set yang tak berulang(unique)
        //hitung
        return 0;
    }

}

public class QueenAttackII {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> obstaclesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowTempItems[j]);
                obstaclesRowItems.add(obstaclesItem);
            }

            obstacles.add(obstaclesRowItems);
        }

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);
        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

