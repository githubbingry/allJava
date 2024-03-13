package coba;

public class operatorAneh {
    public static void main(String[] args) {
        //&, |, ^, >>, >>>, <<, <<<,
        // System.out.println(fun(4,2));
        System.out.println("and & "+(420 & 69));
        System.out.println("or | "+(420 | 69));
        System.out.println("xor ^ "+(420 ^ 69));
        System.out.println("shift signed >> "+(420 >> 69));
        System.out.println("shift unsigned >>> "+(420 >>> 69));
        System.out.println("\"a << b\", the value of \"a\" is shifted to the left by \"b\" positions. << : "+(420 << 69));

        System.out.println();

        byte x, y;
        x=10;
        y=-10;
        System.out.println("Bitwise Left Shift: x<<2 = "+(x<<2));
        System.out.println("Bitwise Right Shift: x>>2 = "+(x>>2));
        System.out.println("Bitwise Zero Fill Right Shift: x>>>2 = "+(x>>>2));
        System.out.println("Bitwise Zero Fill Right Shift: y>>>2 = "+(y>>>2));
    }

    static int fun(int x, int y){
        if (x == 0) return y;
        else return fun(x-1, x*y);
    }
}
