package DariKawan.Fazri;

import java.util.Scanner;

public class AkramSTAN {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double TKP = x.nextInt(), TWK = x.nextInt(), TIU = x.nextInt();
        double mean = (0.4 * TKP) + (0.3 * TWK) + (0.3 * TIU);
        x.close();
        if(TKP<0||TKP>100)
        return;
        if(TWK<0||TWK>100)
        return;
        if(TIU<0||TIU>100)
        return;
        String s = (mean<0) ? "" :
        (mean<=70) ? "Akram tidak lulus" :
        (mean<=90) ? "Akram di ambang lulus" :
        (mean<=100) ? "Akram lulus" : "" ;
        System.out.println(s);
    }
}
