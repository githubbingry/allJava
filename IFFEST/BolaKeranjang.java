package IFFEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class BolaKeranjang {
	
	final public static int START = 1000000001;
	public static int jumP;
	public static int jumK;
	public static int[][] score;
	
	public static void main(String[] args) {
		
		//Input
		Scanner input = new Scanner(System.in);
		jumP = input.nextInt();
		jumK = input.nextInt();
		score = new int[jumP][jumK];
		
		long[] curScore = new long[jumP];
		
		// Read in scores, sort in reverse order.
		for (int i=0; i<jumP; i++) {
			for (int j=0; j<jumK; j++) {
				score[i][j] = input.nextInt();
				curScore[i] += score[i][j];
			}
			Arrays.sort(score[i]);
			reverse(score[i]);
		}
		
		// Initial list.
		line[] list = new line[jumP];
		for (int i=0; i<jumP; i++) 
			list[i] = new line(curScore[i], score[i]);
		
		
		// Solve for player i as we go.
		for (int i=0; i<jumP; i++) {
			
			// Will store each event where item i passes or gets passed by another item.
			ArrayList<item> changes = new ArrayList<item>();
			for (int j=0; j<jumP; j++) {
				if (j == i) continue;
				
				// Add in relevant lead changes between i and j.
				process(list, i, j, changes);
			}
			
			// Sort and sweep through lead changes.
			Collections.sort(changes);
			int cur = 0, beat = 0;
			for (int j=0; j<changes.size(); j++) {
				cur += changes.get(j).add;
				beat = Math.max(beat, cur);
			}
			
			// This is the corresponding rank.
			System.out.println(jumP-beat);
			input.close();
		}
	}
	
	// Adds all score intervals where p1 is strictly beating p2 into changes.
	public static void process(line[] list, int p1, int p2, ArrayList<item> changes) {
		
		// All score to go through.
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i=0; i<jumK; i++) {
			ts.add(score[p1][i]);
			ts.add(score[p2][i]);
		}
		
		// Make copies of these.
		line me = new line(list[p1]);
		line you = new line(list[p2]);
		
		int prev = -1;
		boolean curState = false;
		
		// Go through ts from largest to smallest.
		while (ts.size() > 0) {
			
			// Does a change occur from prev to now and if so, when?
			int now = ts.last();
			
			// I'm winning from the beginning so start past 10^9.
			if (prev == -1) {
				if (me.curVal < you.curVal) {
					changes.add(new item(START, 1));
					curState = !curState;
				}
			}
			
			// I wasn't winning but maybe I could be before the next important point.
			else if (!curState && me.slope > you.slope) {
				
				// add it if I start beating you before the next important point.
				long delta = me.beat(you);
				if (delta <= prev-now)  {
					changes.add(new item(prev-delta,1));
					curState = !curState;
				}
			}
			
			// I'm winning now but maybe you could equal or overtake me.
			else if (curState && me.slope < you.slope) {
				
				// Same as before.
				long delta = you.beatOrEqual(me);
				if (delta <= prev-now) {
					changes.add(new item(prev-delta,-1));
					curState = !curState;
				}
			}
			
			// Update both of our score and move to the next interval.
			int delta = prev == -1 ? 0 : prev-now;
			me.update(now, delta);		
			you.update(now, delta);
			prev = ts.pollLast();
		}
	}
	
	public static void reverse(int[] a) {
		int n = a.length;
		for (int i=0; i<n/2; i++) {
			int temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
	}
}

// Curval is what my score is now, slope is by how much my score is currently getting reduced.
class line {
	
	public long curVal;
	public int slope;
	public int[] score;
	
	public line(long CV, int[] myscore) {
		curVal = CV;
		slope = 0;
		score = myscore;
	}
	
	public line(line copy) {
		curVal = copy.curVal;
		slope = 0;
		score = copy.score;
	}
		
	// Pre-req: other.CV < this.CV && this.slope > other.slope (slope is what we go down by)
	public long beat(line other) {
		long delta = curVal - other.curVal;
		int gain = slope - other.slope;
		return delta/gain + 1;
	}
	
	// Use mod to check equality case.
	public long beatOrEqual(line other) {
		long delta = curVal - other.curVal;
		int gain = slope - other.slope;
		return delta%gain == 0 ? delta/gain : delta/gain + 1;
	}	
	
	// Update our value based on slope and delta (size of interval) and then update the
	// slope by finding the next score less than cur.
	public void update(int cur, int delta) {
		curVal -= (slope*((long)delta));
		while (slope < score.length && score[slope] >= cur) slope++;
	}
}

class item implements Comparable<item> {
	
	public long x;
	public int add;
	
	public item(long where, int val) {
		x = where;
		add = val;
	}
	
	public int compareTo(item other) {
		if (this.x > other.x) return -1;
		if (this.x < other.x) return 1;
		return this.add - other.add;
	}
}