package CodeForces.Contest1926;
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt(), a = 0, b = 0;
        String s = "";
        char[] c = new char[6];
        while (t-- > 0) {
            a=0;
            b=0;
            s = x.next();
            c = s.toCharArray();
            for(int i=0;i<c.length;i++){
                if (c[i] == 'A') a++;
                else b++;
                // System.out.print(" a" + a);
                // System.out.print(" b" + b);
            }
            if(a > b) System.out.println("A");
            else System.out.println("B");
        }
        x.close();
    }
}
