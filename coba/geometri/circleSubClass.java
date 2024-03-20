package coba.geometri;

public class circleSubClass extends geometriObjet{
    private double radius;

    public circleSubClass() {
        super();
    }

    public circleSubClass(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}