package Soal_Pemro_Comp.soal10.soal10_12;

import java.awt.geom.Line2D;

/**
 * Chapter 10 Exercise 12:
 *
 *      My Class for Chapter 10 Exercise 12.
 * Created by Anon6372098 on 9/3/14.
 */

class MyPoint {

    public double x;
    public double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this(0,0);
    }

    public double x() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double y() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint point) {

        return distance(point.x, point.y);
    }

    public MyPoint getCenterPoint(MyPoint p) {

        return new MyPoint((p.x + this.x) / 2, (p.y + this.y) / 2);
    }

    public static MyPoint getCenterPoint(double x1, double y1, double x2, double y2) {
        return new MyPoint((x1 + x2) / 2, (y1 + y2) / 2);
    }

    /** Return true if this point is on the left side of the
     *  directed line from p0 to p1 */
    public boolean leftOfTheLine(MyPoint p0, MyPoint p1) {

        return leftOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);
    }

    /** Return true if this point is on the same
     *  line from p0 to p1 */
    public boolean onTheSameLine(MyPoint p0, MyPoint p1) {

        return onTheSameLine(p0.x, p0.y, p1.x, p1.y, x, y);

    }

    /** Return true if this point is on the right side of the
     *  directed line from p0 to p1 */
    public boolean rightOfTheLine(MyPoint p0, MyPoint p1) {

        return rightOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);

    }

    /** Return true if this point is on the
     *  line segment from p0 to p1 */
    public boolean onTheLineSegment(MyPoint p0, MyPoint p1) {

        return onTheLineSegment(p0.x, p0.y, p1.x, p1.y, x, y);

    }


    /** Return true if point (x2, y2) is on the left side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }
    /** Return true if point (x2, y2) is on the same
     *  line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
    }
    /** Return true if point (x2, y2) is on the
     *  line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }

    /** Return true if point (x2, y2) is on the right side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){

        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

class Triangle2D {

    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D(double x1, double y1, double x2, double y2,
                      double x3, double y3) {
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D() {
        this(new MyPoint(0,0), new MyPoint(1,1), new MyPoint(2,5));
    }

    /** returns point 1 of the triangle **/
    public MyPoint getP1() {
        return p1;
    }

    /** sets the triangle's point 1 **/
    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    /** returns point 2 of the triangle **/
    public MyPoint getP2() {
        return p2;
    }

    /** sets the triangle's point 2 **/

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    /** returns point 3 of the triangle **/
    public MyPoint getP3() {
        return p3;
    }

    /** sets the triangle's point 3 **/
    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    /** returns the perimeter of the triangle. **/
    public double getPerimeter() {

        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        return s1 + s2 + s3;

    }

    /** returns the area of the triangle **/
    public double getArea() {

        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2.0;

        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

    }

    public static double calcArea(MyPoint p1, MyPoint p2, MyPoint p3) {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2.0;

        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

    }


    /** returns true if the specified point is inside this triangle **/
    public boolean contains(MyPoint p) {
//        double area1 = calcArea(p, p1, p2);
//        double area2 = calcArea(p, p2, p3);
//        double area3 = calcArea(p, p3, p1);
//        double area = Math.round((area1 + area2 + area3) * 100) / 100;
//        double triangleArea =  Math.round(getArea() * 100) / 100;
//        (triangleArea == area)


        return contains(p.x(), p.y);
    }

    public boolean contains(double x, double y) {

        // Get max X & Y
        double maxX = getMax(p1.x, p2.x, p3.x);
        double maxY = getMax(p1.y, p2.y, p3.y);

        // Get min X & Y
        double minX = getMin(p1.x, p2.x, p3.x);
        double minY = getMin(p1.y, p2.y, p3.y);

        // Outside the bounding rectangle of the triangle
        if (x < minX || x > maxX || y < minY || y > maxY)  return false;

        // Check if point is the border of the triangle
        MyPoint p = new MyPoint(x, y);
        boolean side1 = p.onTheLineSegment(p1, p2);
        boolean side2 = p.onTheLineSegment(p1, p3);
        boolean side3 = p.onTheLineSegment(p2, p3);
        return side1 || side2 || side3;

    }

    private double getMax(double... n) {
        double max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }
    private double getMin(double... n) {
        double min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }
    /** Return true if point (x2, y2) is on the
     *  line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
    }
    /** returns true if the specified triangle is inside this triangle. **/
    public boolean contains(Triangle2D t) {

        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    /** returns true if the specified triangle overlaps with this triangle. **/
    public boolean overlaps(Triangle2D t) {

        MyPoint[] pt1 = getTrianglePoints();
        MyPoint[] pt2 = t.getTrianglePoints();

        // check is triangle side intersect
        for (int i = 0; i < 3; i++) {
            int maxI = (i+1) % 3; // max indexes

            for (int j = 0; j < 3; j++) {
                int maxJ = (j+1) % 3;
                Line2D line1 = new Line2D.Double(pt2[i].x, pt2[i].y, pt2[maxI].x, pt2[maxI].y);
                Line2D line2 = new Line2D.Double(pt1[i].x, pt1[i].y, pt1[maxJ].x, pt1[maxJ].y);
                if (line1.intersectsLine(line2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private MyPoint[] getTrianglePoints() {

        MyPoint[] points = new MyPoint[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;

        return points;
    }

    /** returns true if the triangle is valid **/
    public boolean isValid() {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        return  ((s1 + s2 > s3) &&
                (s1 + s3 > s2) &&
                (s3 + s2 > s1));
    }

    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2.0;

        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
}