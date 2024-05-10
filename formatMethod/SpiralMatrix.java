package formatMethod;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), m = x.nextInt(); // matrix n*m
        System.out.printf("Spiral Matrix: %d rows, %d columns:\n", n, m);
        print(spiral(n, m));
        x.close();
    }

    // Based on: https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
    static final int[] DIR_ROW = { 0, 1, 0, -1 }, DIR_COL = { 1, 0, -1, 0 };
    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        if (rows == 0) return result;
        boolean[][] seen = new boolean[rows][columns];
        int x = 0, y = 0, di = 0;
        for (int i = 0; i < rows * columns; i++) {
            result[x][y] = i + 1; // Set value
            seen[x][y] = true; // Mark as seen
            int cr = x + DIR_ROW[di], cc = y + DIR_COL[di]; // Bounds checking
            if (0 <= cr && cr < rows && 0 <= cc && cc < columns && !seen[cr][cc]) {
                x = cr;
                y = cc;
            } else {
                di = (di + 1) % 4; // Next direction index
                x += DIR_ROW[di];
                y += DIR_COL[di];
            }
        }
        return result;
    }

    static void print(int[][] matrix) {
        int digit = hitungDigit(matrix.length*matrix[0].length);
        String s = "%"+digit+"d ";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if(matrix.length == 1) s = "%1d ";
                else if(c == 0 && matrix.length > 1) s = "%"+(hitungDigit(matrix[1][0]))+"d ";
                else s = "%"+digit+"d ";
                System.out.printf(s, matrix[r][c]);
            }
            System.out.println();
        }
    }

    static int hitungDigit(int a){
        int sum = 0;
        while(a != 0){
            sum++;
            a /= 10;
        }
        return sum;
    }
}
