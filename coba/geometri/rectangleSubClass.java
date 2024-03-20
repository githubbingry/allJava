package coba.geometri;

public class rectangleSubClass extends geometriObjet{
    private double width;
    private double height;

    public rectangleSubClass() {
        super();
    }

    public rectangleSubClass(String color, boolean isFilled, double width, double height){
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
