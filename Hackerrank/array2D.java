package Hackerrank;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner deez = new Scanner(System.in);
		int array[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = deez.nextInt();
			}
		}
		deez.close();
		int hourglass = 0;
		int max = -100;
		for (int i = 0; i < 4; i++) {
            if (i == 0)
				max = hourglass;
			for (int j = 0; j < 4; j++) {
				hourglass = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
				if (hourglass > max)
					max = hourglass;
			}
		}
		System.out.println(max);
    }
}
