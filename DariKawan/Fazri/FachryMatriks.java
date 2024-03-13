package DariKawan.Fazri;

import java.util.Scanner;

public class FachryMatriks {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int m = x.nextInt();
        String s = "";
        if(n>0 && m>0){
            for (int i = 0 ; i < m ; i++){
                s += "* ";
            }
            for (int j = 0 ; j < n ; j++){
                System.out.println(s);
            }
        } else System.out.println("0");
        x.close();
    }
}
