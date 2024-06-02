package coba.hewan;

public class TestHewan {
    public static void main(String[] ergos) {
        Kucing k = new Kucing("Kucing");
        k.keunikan();
        Gajah g = new Gajah("Gajah");
        g.keunikan();

        Hewan h = new Kucing("udin");
        h.keunikan();

        Hewan i = new Hewan("ujang");
        i.keunikan();

        i = new Kucing("dikal");
        i.keunikan();

        Hewan j;
        j = (Kucing)i;
        j.keunikan();
    }
}
