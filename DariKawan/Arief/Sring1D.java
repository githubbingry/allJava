package DariKawan.Arief;

import java.util.Arrays;
import java.util.Scanner;

public class Sring1D {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    String[] stringArray = new String[n];
	    for (int i = 0; i < stringArray.length; i++) {
	    	stringArray[i] = scan.next();
	    }
	    
	    char[][] charArray = new char[stringArray.length][];
	    for (int i = 0; i < stringArray.length; i++) {
	        charArray[i] = stringArray[i].toCharArray();
	    }
	    System.out.println(Arrays.deepToString(charArray));
	    scan.close();
	}

}
