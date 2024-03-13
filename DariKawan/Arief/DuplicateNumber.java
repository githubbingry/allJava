package DariKawan.Arief;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n+1];
		
		for (int i = 0; i < n+1 ; i++) {
			arr[i] = scan.nextInt();
            }
		
		for (int i = 0; i < n+1; i++)
			for(int j = i+1; j < n+1; j++) {  
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
	        }	  
		
		scan.close();
	}

}
