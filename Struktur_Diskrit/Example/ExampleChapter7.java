package Struktur_Diskrit.Example;

import java.util.Scanner;

public class ExampleChapter7 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int pilih, n, t;
        System.out.printf("""
            1. Hal 111 Non-Rekursif Sequence 2, 4, 6, 8, 10, 12, ...; t(n) = 2n
            2. Hal 111 Rekursif Sequence 2, 4, 6, 8, 10, 12, ...; t(1) = 2; t(n) = t(n-1) + 2, n > 1
            3. Hal 112 Example 7.1.1 Non-Rekursif Sequence 2, 5, 8, 11, 14, 17, ...; t(n) = 3n-1
            4. Hal 112 Example 7.1.1 Rekursif Sequence 2, 5, 8, 11, 14, 17, ...; t(1) = 2; t(n) = t(n-1) + 3, n > 1
            5. Hal 113 Example 7.1.3 Rekursif Sequence 3, 8, 19, 42, ...; t(1) = 3; t(n) = 2t(n-1) + n, n > 1
            6. Hal 115 Rekursif Factorial n!, n >= 0"""
        );
        System.out.print("\nPilih Example : ");
        pilih = x.nextInt();
        System.out.print("\nMasukkan Nilai n : ");
        n = x.nextInt();
        switch (pilih) {
            case 1:
                System.out.printf("t(%d) = 2*%d = %d", n, n, 2*n);
                break;
            case 2:
                t = 2; //t(1) = 2
                System.out.printf("t(1) = %d\n", t);
                for(int i = 2; i <= n; i++){
                    t = t + 2;
                    System.out.printf("t(%d) = t(%d) + 2 = %d + 2 = %d\n", i, i-1, t-2, t);
                }
                break;
            case 3:
                System.out.printf("t(%d) = 3*%d - 1 = %d", n, n, 3*n-1);
                break;
            case 4:
                t = 2; //t(1) = 2
                System.out.printf("t(1) = %d\n", t);
                for(int i = 2; i <= n; i++){
                    t = t + 3;
                    System.out.printf("t(%d) = t(%d) + 2 = 3*%d - 1 = %d\n", i, i-1, t-2, t);
                }
                break;
            case 5:
                t = 3; //t(1) = 3
                System.out.printf("t(1) = %d\n", t);
                for(int i = 2; i <= n; i++){
                    t = 2*t + i;
                    System.out.printf("t(%d) = t(%d) + n = 2*%d + %d = %d\n", i, i-1, t-2, i, t);
                }
                break;
            case 6:
                t = 1; //t(1) = 1
                System.out.printf("t(1) = %d\n", t);
                for(int i = 2; i <= n; i++){
                    t = t*i;
                    System.out.printf("t(%d) = t(%d)*%d = %d*%d = %d\n", i, i-1, i, t/i, i, t);
                }
                break;
            default:
                break;
        }
        x.close();
    }
}