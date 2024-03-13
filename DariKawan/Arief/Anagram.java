package DariKawan.Arief;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean anagram = true;
		String str1 = scan.next();
		String str2 = scan.next();
	    char[] a1 = str1.toCharArray();
	    char[] a2 = str2.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    
	    if (a1.length != a2.length)
	    	anagram = false;
	    else {
	    	for (int i = 0; i < str1.length(); i++) {
		    	if (a1[i] != a2[i])
		    		anagram = false;
		    }
	    }
	    
	    if (anagram)
	    	System.out.println("Anagram!");
	    else 
	    	System.out.println("Bukan Anagram!");
		
		scan.close();
	}
}
