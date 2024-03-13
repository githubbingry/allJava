package Soal_Pemro_Comp.soal8.soal8_1;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("r1 :\n" + r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println("r2 :\n" + r2.getWidth());
        System.out.println(r2.getHeight());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

        System.out.println(r1.s);
        System.out.println(r1.c + "s");
        // System.out.println(r1.b);

        // System.out.println(r1.r);

    }
}
