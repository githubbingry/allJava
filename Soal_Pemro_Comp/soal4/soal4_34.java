package Soal_Pemro_Comp.soal4;

import java.util.Scanner;

public class soal4_34 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int countPlayer = 0, countComp = 0, countGame = 0;
        do{
            System.out.println("Game " + ++countGame);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int n = x.nextInt(), comp;
            String ns = (n == 0) ? "scissor" : (n == 1) ? "rock" : (n ==2) ? "paper" : "invalid";
            do {
                comp = (int)(Math.random()*10)/3;
            } while (comp > 2);
            String comps = (comp == 0) ? "scissor" : (comp == 1) ? "rock" : (comp ==2) ? "paper" : "invalid";
            if (ns == "invalid" || comps == "invalid")
            System.out.println("invalid");
            else{
                if (ns == comps)
                System.out.println("The computer is "+ comps +". You are "+ ns +" too. It is a draw");
                else if (n > comp){
                    System.out.println("The computer is "+ comps +". You are "+ ns +". You won");
                    countPlayer++;
                }
                else{
                    System.out.println("The computer is "+ comps +". You are "+ ns +". You lose");
                    countComp++;
                }
            }
            System.out.println("Your point : " + countPlayer);
            System.out.println("Computer point : " + countComp);
            System.out.println();
        } while (countComp < 3 && countPlayer < 3);

        System.out.println("Total game : " + countGame);
        System.out.println("Total draw : " + (countGame - (countComp + countPlayer)));
        if (countComp == 3)
            System.out.println("Computer win with score " + countPlayer + " - " + countComp);
        else if (countPlayer == 3)
            System.out.println("Player win with score " + countPlayer + " - " + countComp);
        x.close();
    }
}
