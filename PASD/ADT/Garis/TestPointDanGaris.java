package PASD.ADT.Garis;

public class TestPointDanGaris {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        System.out.println(p1);
        Point p2 = new Point();
        System.out.println(p2);
        
        System.out.println();
        Garis g1 = new Garis();
        System.out.println(g1);
        Garis g2 = new Garis(p1, p2);
        System.out.println(g2);
        System.out.println(g2.getPanjangGaris());

        System.out.println();
        g2.setAwal(new Point());
        g2.setAkhir(new Point(5, 6));
        System.out.println(g2);
        System.out.println(g2.getPanjangGaris());

        System.out.println();
        g2.setAwal(new Point(9,8));
        g2.setAkhir(new Point(9, 8));
        System.out.println(g2);
        System.out.println(g2.getPanjangGaris());
        System.out.println(g2.getGradien());
        System.out.println(g2.getFunction());
        System.out.println();

        Garis g3 = new Garis(new Point(5, 5), new Point(6, 6));
        System.out.println(g3);
        System.out.println(g3.getPanjangGaris());
        System.out.println(g3.getGradien());
        System.out.println(g3.getAngleRadian());
        System.out.println(g3.getAngleDegree());
        System.out.println(g3.getFunction());
        System.out.println();
        
        Garis g4 = new Garis(new Point(0, 5), new Point(5, 5));
        System.out.println(g4);
        System.out.println(g4.getPanjangGaris());
        System.out.println(g4.getGradien());
        System.out.println(g4.getAngleRadian());
        System.out.println(g4.getAngleDegree());
        System.out.println(g4.getFunction());
        // g4.getAkhir().setX(0); //this make it broke, hapus setter di adt point
        // System.out.println(g4);
        // System.out.println(g4.getPanjangGaris());
        // System.out.println(g4.getGradien());
        // System.out.println(g4.getAngleRadian());
        // System.out.println(g4.getAngleDegree());
        // System.out.println(g4.getFunction());
    }
}
