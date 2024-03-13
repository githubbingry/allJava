package Soal_Pemro_Comp.soal3;

import java.util.Scanner;

public class soal3_17 {
    public static void main(String[] args) {
        int comp = (int)(Math.random()*10)/3;
        if (comp > 2)
            main(args);
        Scanner x = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int n = x.nextInt();
        String ns = (n == 0) ? "scissor" : (n == 1) ? "rock" : (n ==2) ? "paper" : "invalid";
        String comps = (comp == 0) ? "scissor" : (comp == 1) ? "rock" : (comp ==2) ? "paper" : "invalid";
        if (ns == "invalid" || comps == "invalid")
            System.out.println("invalid");
        else{
            if (ns == comps)
                System.out.println("The computer is "+ comps +". You are "+ ns +" too. It is a draw");
            else if (n > comp)
                System.out.println("The computer is "+ comps +". You are "+ ns +". You won");
            else
                System.out.println("The computer is "+ comps +". You are "+ ns +". You lose");
        }
        x.close();
    }
}
