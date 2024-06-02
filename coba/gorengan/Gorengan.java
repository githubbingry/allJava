package coba.gorengan;

public class Gorengan {
    int bayar;

    public Gorengan(String jenis){
        System.out.println("Jenis Gorengan = " + jenis);
    }

    public String tampilBayar(){
        return "Bayar = " + this.bayar;
    }
}
