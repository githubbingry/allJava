package coba;

public class franchise {
    private String nama;
    private int id;
    private double gaji;
    private String tugas;
    // private String Gaji;

    public franchise(String nama, int id){
        this.nama = nama;
        this.id = id;
        this.gaji = getGaji();
        this.tugas = getTugas();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //id :
    /*
    1 manajer gaji 7 jt
    2 kasir gaji 1,2 jt
    3 koki gaji 2 jt
    4 waiter gaji 1,2 jt
    5 satpam gaji 1 jt
    */
    public double getGaji() {//dalam jutaan rupiah
        if (getId() == 1) return 7;
        else if (getId() == 2) return 1.2;
        else if (getId() == 3) return 2;
        else if (getId() == 4 )return 1.2;
        else return 1;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getTugas() {
        if (getId() == 1) return "Melakukan manajemen untuk franchise";
        else if (getId() == 2) return "Melakukan transaksi dengan pembeli";
        else if (getId() == 3) return "Memasak makanan dan Membuat minuman";
        else if (getId() == 4 )return "Melayani dan Menyajikan pesanan pembeli";
        else return "Menjaga keamanan didalam dan diluar franchise";
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    @Override
    public String toString(){
        return String.format("""
            Nama : %s
            Id Pegawai : %d
            Gaji : %.1f Juta
            Tugas : %s
                """, this.nama, getId(), this.gaji, this.tugas);
    }
}
