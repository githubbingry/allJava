package Code_League.CL_8;

import java.util.Scanner;

public class YelanShenhe {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), county = 0, counts = 0;
        String[] ar = new String[n];
        for (int i = 0; i < n; i++){
            ar[i] = x.next();
        }
        for (int i = 0; i< n; i += 2){
            if ((ar[i].equals("batu") && ar[i+1].equals("kertas"))
            ||(ar[i].equals("kertas") && ar[i+1].equals("gunting"))
            ||(ar[i].equals("gunting") && ar[i+1].equals("batu"))) county++;
            else if (ar[i].equals(ar[i+1])) {counts++; county++;}
            else counts++;
        }
        if (county > counts) System.out.println("Shenhe menang");
        else if ( counts > county) System.out.println("Yelan menang");
        else System.out.println("Draw");
        x.close();
    }
}
