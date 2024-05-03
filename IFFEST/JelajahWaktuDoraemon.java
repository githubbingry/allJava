package IFFEST;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JelajahWaktuDoraemon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        int n = input.nextInt();
        PriorityQueue<Integer> TMenergy = new PriorityQueue<>(); 

        for (int i = 0; i < n; i++) {
            int ni = input.nextInt();
            for (int j = 0; j < ni; j++) {
                TMenergy.add(input.nextInt());
            }
        }
        input.close();

        while (!TMenergy.isEmpty() && y + TMenergy.peek() <= 0) {
            y += TMenergy.poll();
        }

        System.out.println(y);
    }
}
// TMenergy = Time Machine Energy