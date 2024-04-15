package DariKawan.Hani;

public class tesgaris {
    public static void main (String []args){
        garis g1 = new garis();
        System.out.println(g1.toString());

        g1.setAwal(0,2);
        System.out.println(g1.toString());
        g1.setAkhir(5,7);
        System.out.println(g1.toString());
        g1.setAwal(5,7);

        System.out.println();
        garis g2 = new garis(2,3,4,5);
        System.out.println(g2.toString());
        g2.setAwal(1,2);
        System.out.println(g2.toString());
        g2.setAkhir(2, 3);
        System.out.println(g2.toString());
        g2.setAwal(2,3);

}
}
