package Compe_Prog;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Djio_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] piring = new Integer[N];
        for (int i = 0; i < N; i++) {
            piring[i] = scanner.nextInt();
        }
        System.out.println(minimumTumpukan(piring));
        scanner.close();
    }

    public static int minimumTumpukan(Integer[] piring) {
        Arrays.sort(piring, Collections.reverseOrder());
        PriorityQueue<Integer> tumpukan = new PriorityQueue<>();
        for (int i : piring) {
            if (tumpukan.isEmpty() || tumpukan.peek() > i) {
                tumpukan.add(i);
            } else {
                while (!tumpukan.isEmpty() && tumpukan.peek() <= i) {
                    tumpukan.poll();
                }
                tumpukan.add(i);
            }
        }
        return tumpukan.size();
    }
}
