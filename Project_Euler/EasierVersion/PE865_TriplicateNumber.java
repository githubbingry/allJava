package Project_Euler.EasierVersion;

import java.util.ArrayList;
import java.util.Scanner;

public class PE865_TriplicateNumber {
    public static void main(String[] args) { //search minimum iterasi?
        //cara efisien lain yaitu buat 3 variabel char untuk ngecheck tanpa menggunakan count
        /*
        untuk //122555211344431113
        iterasi minimum = 2 dengan pengulangan i = 0
        iterasi lainnya = 3 dengan pengulangan i -= 3
         */
        Scanner x = new Scanner(System.in);
        String s = x.next(); //maks input 8190 char
        x.close();
        int countDelete = 0;
        int iterasi = 0;
        char[] ca = s.toCharArray();
        ArrayList<Character> c = new ArrayList<>();
        char t = ' ';
        for(int i = 0; i < ca.length; i++){
            c.add(ca[i]);
        }
        while(!c.isEmpty()){
            int count = 0;
            int idx = 0;
            t = c.get(0);
            for(int i = 0; i < c.size(); i++, idx++){
                if(t == c.get(i).charValue()) count++;
                else {
                    count = 1;
                    t = c.get(i);
                }
                if(count == 3) {
                    c.remove(i);
                    c.remove(i-1);
                    c.remove(i-2);
                    // i -= 3;
                    i = 0;
                    count = 1;
                    countDelete++;
                }
                System.out.println(c.toString());
                iterasi++; //banyak loop dilakukan
            }
            // System.out.println("terhapus "+ countDelete);
            System.out.println("iterasi "+ iterasi);
            if(idx == c.size()) break;
        }
        if(c.isEmpty()){
            System.out.println("yes");
            // System.out.println(countDelete);
            System.out.println(countDelete + " " + iterasi);
        } else {
            System.out.println("No");
            System.out.println(countDelete + " " + c.size());
        }
    }
}
