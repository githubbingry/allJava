package DariKawan.Andhika;

import java.util.Scanner;

public class String1D {
    public static void main (String[] args) {
		Scanner deez = new Scanner(System.in);
		int n = deez.nextInt();
		String data1[] = new String[n];
		for (int i = 0; i < n;  i++) {
			data1[i] = deez.next();
		}
		
		int maxcoloumn = 0;
		for (String maxc : data1) {
            if (maxc.length() > maxcoloumn) {
                maxcoloumn = maxc.length();
            }
		}
		
		char data2[][] = new char[n][maxcoloumn];
		for (int i = 0; i < n;  i++) {
			String dividing = data1[i];
			for (int j = 0; j < dividing.length(); j++) {
				data2[i][j] = dividing.charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < maxcoloumn; j++) {
				System.out.print(data2[i][j]+" ");
			}
			System.out.println();
		}
		deez.close();
	}
}
