package coba;

class JAM {
    private int jam;
    private int menit;
    private int detik;

    public JAM (int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    public int getJam(){return jam;}
    public int getMenit(){return menit;}
    public int getDetik(){return detik;}
}
public class jamADT {
    JAM j ;
}
