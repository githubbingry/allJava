package coba.gorengan;

public class PisangGoreng extends Gorengan{
    int porsi, harga;

    public PisangGoreng(String jenis){
        super(jenis);
    }

    public void hitungBayar(){
        super.bayar = porsi*harga;
    }
}