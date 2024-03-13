package coba;

public class mobil {
    private int ban;
    private String warna;
    private String merk;

    public mobil(int ban, String warna, String merk){
        this.ban = ban;
        this.warna = warna;
        this.merk = merk;
    }

    public int getBan(){ return ban; }
    public String getWarna(){ return warna; }
    public String getMerk(){ return merk; }

    public void setBan(int ban){
        this.ban = ban;
    }

    public void setWarna(String warna){
        this.warna= warna;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public static void main(String[] args) {
        mobil m = new mobil(4, "merah", "udin");
        System.out.println(m.ban);
        m.ban = 10;
        System.out.println(m.ban);
        m.setBan(20);
        System.out.println(m.ban);
        System.out.println(m.getBan());
    }
}
