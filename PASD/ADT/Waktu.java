package PASD.ADT;

public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(){
        this(0, 0, 0);
    }

    public Waktu(int jam, int menit, int detik) {
        if(jam > -1 && jam < 24){
            System.out.println("Inputan jam valid");
            this.jam = jam;
        } else {
            System.out.println("Inputan jam tidak valid, jam menjadi default(0)");
            this.jam = 0;
        }

        if(menit > -1 && menit < 60){
            System.out.println("Inputan menit valid");
            this.menit = menit;
        } else {
            System.out.println("Inputan menit tidak valid, menit menjadi default(0)");
            this.menit = 0;
        }
        
        if(detik > -1 && detik < 60){
            System.out.println("Inputan detik valid");
            this.detik = detik;
        } else {
            System.out.println("Inputan detik tidak valid, detik menjadi default(0)");
            this.detik = 0;
        }
    }

    public int getJam() {
        return this.jam;
    }
    public void setJam(int jam) {
        if(jam > -1 && jam < 24){
            System.out.println("Inputan jam valid");
            this.jam = jam;
        } else {
            System.out.println("Inputan jam tidak valid, perubahan gagal");
        }
    }

    public int getMenit() {
        return this.menit;
    }
    public void setMenit(int menit) {
        if(menit > -1 && menit < 60){
            System.out.println("Inputan menit valid");
            this.menit = menit;
        } else {
            System.out.println("Inputan menit tidak valid, perubahan gagal");
        }
    }

    public int getDetik() {
        return this.detik;
    }
    public void setDetik(int detik) {
        if(detik > -1 && detik < 60){
            System.out.println("Inputan detik valid");
            this.detik = detik;
        } else {
            System.out.println("Inputan detik tidak valid, perubahan gagal");
        }
    }

    //buat print cetakWaktu dan toString
    //buat waktuToDetik dan detikToWaktu
}
