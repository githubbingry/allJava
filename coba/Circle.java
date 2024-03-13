package coba;

public class Circle {
    public double radius = 1;
    int a;

    Circle(){
        a++;
        radius = 1;
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2*Math.PI*radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.radius);
    }
}
