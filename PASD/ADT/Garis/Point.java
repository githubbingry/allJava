package PASD.ADT.Garis;

final public class Point {
    final private int x, y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    // public void setX(int x) {
    //     this.x = x;
    // }

    public int getY() {
        return this.y;
    }

    // public void setY(int y) {
    //     this.y = y;
    // }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
