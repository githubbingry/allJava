package coba.gorengan;

public class MakanGorengan {
    public static void main(String[] args) {
        Bakwan b = new Bakwan("Bakwan");
        b.harga = 1500;
        b.porsi = 3;
        b.hitungBayar();
        System.out.println(b.tampilBayar());

        PisangGoreng pg = new PisangGoreng("Pisang Goreng");
        pg.harga = 2000;
        pg.porsi = 2;
        pg.hitungBayar();
        System.out.println(pg.tampilBayar());
    }
}
