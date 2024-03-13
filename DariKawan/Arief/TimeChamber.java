package DariKawan.Arief;

import java.util.Scanner;

public class TimeChamber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long P = scan.nextLong();
		long Q = scan.nextLong();
		long R = scan.nextLong();
//		int hari = 0;
//		while (P<Q) {
//			hari++;
//			P += R;
//		}
//		double waktu = (double)hari / 365d * 24d * 60 * 60;
//		
//		System.out.println((int)Math.ceil(waktu));
//		System.out.println(hari);
		scan.close();
		
		double day = (double)(Q-P) / R;
		double time = (double)Math.ceil(day) / 365d * 24d * 60d * 60d;
		System.out.println((int)Math.ceil(time));
		System.out.println((int)Math.ceil(day));
	}

}
