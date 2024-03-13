package DariKawan.Fazri;

public class patternFazri {
    // public static void main(String[] args) {
    //     Scanner x = new Scanner(System.in);
    //     int n = x.nextInt();
    //     n = (n <= 10000 && n >= 1) ? n : 0;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = n; j > i; j--)
    //             System.out.print(j < 10 ? "  " : (j < 100) ? "   " : (j < 1000) ? "    " : "     ");
    //         for (int k = i; k > 1; k--)
    //             System.out.print(k + " ");
    //         for (int l = 1; l <= i; l++)
    //             System.out.print(l + " ");
    //         System.out.println();
    //     }
    //     x.close();
    // }

    public static void main(String[] args) {
        int startRight = 0, endSpace = 7;
        int row = 1;
        while (row <= 128) {
            int startSpace = 0;
            while (startSpace < endSpace) {
                System.out.print("    ");
                startSpace++;
            }
            int l = 1;
            while (l <= row) {
                System.out.printf("%4d", l);
                l += l;
            }
            int r = startRight;
            while (r > 0) {
                System.out.printf("%4d", r);
                r /= 2;
            }
            System.out.println();
            endSpace--;
            startRight = row;
            row += row;
        }
    }
}
