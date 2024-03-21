package Soal_Pemro_Comp.Soal_Ujian_Pemro.SoalUTS2;

public class Pegawai {
    //4 datafield nama, id, gaji, tugas
    private String nama;
    private int idPegawai;
    private double gaji;
    private String tugas;

    //generate getter dan setter datafield melalui source action
    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}

    public int getIdPegawai() {return idPegawai;}
    public void setIdPegawai(int idPegawai) {this.idPegawai = idPegawai;}

    public double getGaji() {return gaji;}
    public void setGaji(double gaji) {this.gaji = gaji;}

    public String getTugas() {return tugas;}
    public void setTugas(String tugas) {this.tugas = tugas;}

    //empty constructor
    public Pegawai() {}

    //constructor dengan parameter tiap datafield
    public Pegawai(String nama, int idPegawai, double gaji, String tugas) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gaji = gaji;
        this.tugas = tugas;
    }

    //format print data pegawai
    public String toString() {
        return String.format("""
            Nama : %s
            Id Pegawai : %d
            Gaji : %.1f Juta
            Tugas : %s""",
            nama, idPegawai, gaji, tugas
        );
    }
}

//5 child pegawai :

//1 manajer
class Manajer extends Pegawai {
    public Manajer(String nama) {super(nama, 1, 7, "Melakukan manajemen untuk franchise");}
}

//2 pelayan
class Pelayan extends Pegawai {
    public Pelayan(String nama) {super(nama, 2, 1.2, "Melakukan transaksi dengan pembeli");}
}

//3 koki
class Koki extends Pegawai {
    public Koki(String nama) {super(nama, 3, 2, "Memasak makanan dan Membuat minuman");}
}

//4 kasir
class Kasir extends Pegawai {
    public Kasir(String nama) {super(nama, 4, 1.2, "Melayani dan Menyajikan pesanan pembeli");}
}

//5 satpam
class Satpam extends Pegawai {
    public Satpam(String nama) {super(nama, 5, 1, "Menjaga keamanan didalam dan diluar frenchise");}
}