package coba.hewan;

public class Kucing extends Hewan {
    public Kucing(String jenis) {
        super(jenis);
        super.jenis = jenis;
    }

    @Override
    public void keunikan() {
        System.out.println("Pintar berburu tikus.");
    }
}
