package Soal_Pemro_Comp.soal10.soal10_12;

/**
 * TestTriangle2D
 */
public class testTriangle2D {
    public static void main(String[] args) {
        Triangle2D r1 = new Triangle2D(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));

        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println("Point is inside triangle: " + r1.contains(1, 1));

        System.out.println("Triangle 2 is inside this triangle: " + r1.contains( new Triangle2D(4, 5, 10.5, 3.2, -0.5, -10.5)));
        System.out.println("Triangle 3 is overlaps this triangle: " + r1.overlaps(new Triangle2D(1, 1.7, -1, 1.7, 0,-3)));
    }
}