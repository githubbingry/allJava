package DariKawan.Arief;

import java.util.Scanner;

public class UrutanTerurut {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n ; i++) {
			arr[i] = scan.nextInt();
            }
		int max = 1, len = 1;
		
		for (int i=1; i<n; i++) {
            if (1 == arr[i] - arr[i-1])
                len++;
            else if (-1 == arr[i] - arr[i-1])
            	len++;
            else
            {

                if (max < len)    
                    max = len;   
                len = 1;    
            }    
        }
        if (max < len)
            max = len;
        
        System.out.println(max);
		scan.close();
	}

}
