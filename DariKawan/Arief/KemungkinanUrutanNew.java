package DariKawan.Arief;

import java.util.HashMap;
import java.util.Scanner;

public class KemungkinanUrutanNew {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	    String word = scan.next();
	    scan.close();

	    HashMap<Character, Integer> sequences = new HashMap<Character, Integer>();

	    for (char c : word.toCharArray()) {
	      sequences.put(c, sequences.getOrDefault(c, 0) + 1);
	    }

	    System.out.println(seePossibilities(sequences));
	  }

	  private static int seePossibilities(HashMap<Character, Integer> sequences) {
	    int count = 0;
	    for (char c : sequences.keySet()) {
	      if (sequences.get(c) > 0) {
	        count++;
	        sequences.put(c, sequences.get(c) - 1);
	        count += seePossibilities(sequences);
	        sequences.put(c, sequences.get(c) + 1);
	      }
	    }
	    return count;

	}

}
