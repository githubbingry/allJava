package IFFEST.Final2024;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Dekomposisi {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        TreeMap<Integer, LinkedList<Integer>> a = new TreeMap<>();
        while(n---1>0){
            a.get(x.nextInt()).add(x.nextInt());
        }
        x.close();
    }
}
