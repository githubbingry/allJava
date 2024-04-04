package DariKawan.Andhika;

import java.util.HashMap;
import java.util.Scanner;

public class QueensAttackII {
	public static void main(String[] args) {
        HashMap <String, Integer> obstacles = new HashMap<>();
        Scanner deez = new Scanner(System.in);
        int n = deez.nextInt();
        int k = deez.nextInt();
        int r_q = deez.nextInt();
        int c_q = deez.nextInt();
        for (int i = 0; i < k; i++) {
            int a = deez.nextInt();
            int b = deez.nextInt();
            String current = ""+a+" "+b;
            obstacles.put(current, obstacles.getOrDefault(current, 0) + 1);
        }
        deez.close();
        int ways = 0;
        //to the right
        int r = c_q;
        while (r < n) {
            r++;
            String ttr = ""+r_q+" "+r;
            if (obstacles.containsKey(ttr)) {
                break;
            }
            ways++;
        }
        //to the left
        int l = c_q;
        while (l > 1) {
            l--;
            String ttl = ""+r_q+" "+l;
            if (obstacles.containsKey(ttl)) {
                break;
            }
            ways++;
        }
        //to the top
        int t = r_q;
        while (t < n) {
            t++;
            String ttt = ""+t+" "+c_q;
            if (obstacles.containsKey(ttt)) {
                break;
            }
            ways++;
        }
        //to the bottom
        int b = r_q;
        while (b > 1) {
            b--;
            String ttb = ""+b+" "+c_q;
            if (obstacles.containsKey(ttb)) {
                break;
            }
            ways++;
        }
        //to the top right
        r = c_q;
        t = r_q;
        while (r < n && t < n) {
            r++;
            t++;
            String tttr = ""+t+" "+r;
            if (obstacles.containsKey(tttr)) {
                break;
            }
            ways++;
        }
        //to the top left
        l = c_q;
        t = r_q;
        while (l > 1 && t < n) {
            l--;
            t++;
            String tttl = ""+t+" "+l;
            if (obstacles.containsKey(tttl)) {
                break;
            }
            ways++;
        } 
        //to the bottom right
        r = c_q;
        b = r_q;
        while (r < n && b > 1) {
            r++;
            b--;
            String ttbr = ""+b+" "+r;
            if (obstacles.containsKey(ttbr)) {
                break;
            }
            ways++;
        } 
        //to the bottom left
        l = c_q;
        b = r_q;
        while (l > 1 && b > 1) {
            l--;
            b--;
            String ttbl = ""+b+" "+l;
            if (obstacles.containsKey(ttbl)) {
                break;
            }
            ways++;
        }
        System.out.println(ways);
    }
}
