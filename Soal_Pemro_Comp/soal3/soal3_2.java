package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numb1, numb2, numb3, answer ;
        boolean benar = false ;
        numb1 = (int)(Math.random()*10);
        numb2 = (int)(Math.random()*100);
        numb3 = (int)(Math.random()*1000);
        System.out.println("Berapa "+numb1+" + "+numb2+" + "+numb3+" ?");

        answer = x.nextInt();
        benar = numb1 + numb2 + numb3 == answer;
        System.out.println(numb1+ " + "+numb2+" + "+numb3+" = "+answer+"\nbernilai "+benar);
        x.close();
    }
}
