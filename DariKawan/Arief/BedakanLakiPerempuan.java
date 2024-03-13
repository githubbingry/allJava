package DariKawan.Arief;

import java.util.Scanner;

public class BedakanLakiPerempuan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char arr[] = new char[n];
		int L = 0;
		int P = 0;
		for (int i=0; i<n; i++) {
			arr[i] = scan.next().charAt(0);
			if (arr[i] == 'L')
				L += 1;
			else if (arr[i] == 'P')
				P += 1;
		}
		System.out.println("L : " + L);
		System.out.println("P : " + P);
		scan.close();
	}

}
