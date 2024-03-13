package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numb1, numb2, answer ;
        boolean benar = true ;
        numb1 = (int)(Math.random()*100);
        numb2 = (int)(Math.random()*100);
        if(numb1<10||numb2<10)
        main(args);
        System.out.println("Berapa "+numb1+" + "+numb2+" ?");
        answer = x.nextInt();
        benar = numb1 + numb2 == answer;
        System.out.println(numb1+ " + "+numb2+" + "+" = "+answer+"\nbernilai "+benar);
        x.close();
    }
}
