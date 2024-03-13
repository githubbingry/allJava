package Code_League.CL_8;

import java.util.Scanner;

public class PembagianNilai {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt(), ar[] = new int[n];
        for (int i = 0; i < n; i++){
            ar[i] = x.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (ar[i] > 84) System.out.println("Grade A");
            else if (ar[i] > 69) System.out.println("Grade B");
            else if (ar[i] > 59) System.out.println("Grade C");
            else if (ar[i] > 44) System.out.println("Grade D");
            else if (ar[i] > 0) System.out.println("Grade E");
        }
        x.close();
    }
}
