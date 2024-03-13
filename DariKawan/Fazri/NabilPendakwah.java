package DariKawan.Fazri;

import java.util.Scanner;

public class NabilPendakwah {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long harta = x.nextInt();
        long zakat = 0;
        x.close();
        if (harta<0) return;
        else if (harta<Math.pow(10,6)*85)
            System.out.println(zakat);
        else {
            zakat = harta*25/1000;
            System.out.println(zakat);
        }
    }
}
