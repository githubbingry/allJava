package DariKawan.Fazri;

import java.util.Scanner;

public class PermutasiFazri {
    public static long permutasi(int n, int r) {
        if (r == 0) {
            return 1;
        } else {
            long result = permutasi(n - 1, r - 1);
            if (result < 0 || Long.MAX_VALUE / n < result) {
                return -1;
            } else {
                return n * result;
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long hasil;
            System.out.print("Masukkan nilai n: ");
            int n = sc.nextInt();
            System.out.print("Masukkan nilai r: ");
            int r = sc.nextInt();

            if (n < r) {
                System.out.println("n harus lebih besar atau sama dengan r");
            } else if (n < 0 || r < 0) {
                System.out.println("n dan r tidak boleh negatif");

            } else {
                hasil = (long) (permutasi(n, r));
                if (hasil == -1) {
                    System.out.println("Hasil permutasi terlalu besar sehingga menyebabkan value overflow");
                    return;
                }

                System.out.printf("Hasil permutasi dari P(n, r) = P(%d, %d) adalah %d", n, r, hasil);
            }
        }
    }

}
