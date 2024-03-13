package tlxtoki;
import java.util.Scanner;
public class PermainanABC {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long a = x.nextLong(), b = a - 1;
        while (a > --b) {
            if (loop(a, b) == 0) break;
        }
        System.out.println(b);
        x.close();
    }

    static long loop(long a, long b){
        while (b > 0){
            long c = a-b;
            a = b;
            b = c;
        }
        return b;
    }
}
