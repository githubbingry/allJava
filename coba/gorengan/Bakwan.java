package coba.gorengan;

public class Bakwan extends Gorengan {
    int porsi, harga;

    public Bakwan(String jenis){
        super(jenis);
    }

    public void hitungBayar(){
        super.bayar = porsi*harga;
    }
}
