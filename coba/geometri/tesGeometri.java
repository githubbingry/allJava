package coba.geometri;

public class tesGeometri {
    public static void main(String[] args) {
        circleSubClass c1 = new circleSubClass("red", true, 10);
        rectangleSubClass r1 = new rectangleSubClass("white", true, 5, 6);
        geometriObjet g1 = new geometriObjet("blue", true);

        // System.out.println(c1.toString());
        // System.out.println(r1.toString());
        // System.out.println(g1.toString());

        display(c1);
        display(r1);
        display(g1);
    }

    private static void display(geometriObjet object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
