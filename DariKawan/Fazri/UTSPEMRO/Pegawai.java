/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Tugas    : Mengimplementasikan Soal UTS Menggunakan Konsep OOP (Inheritance & Polymorphism)
 * Nama File: Pegawai.java
 */

// Catatan: kesalahan kata atau typo disengajakan sesuai dengan contoh output soal (deskripsi soal dan output soal sedikit berbeda, saya menggunakan patokan contoh output soal).
// Penyesuaian untuk output child Pegawai kelima (Satpam), idPegawai-nya adalah 5 (dalam contoh output soal adalah 2, konflik dengan child Pegawai kedua (Pelayan) yang idPegawai-nya 2).

package DariKawan.Fazri.UTSPEMRO; // ganti atau hapus baris package ini jika dalam package lain/tidak dalam package apapun

public class Pegawai {
    private String nama;
    private int idPegawai;
    private double gaji;
    private String tugas;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdPegawai() {
        return this.idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public double getGaji() {
        return this.gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public Pegawai() {
    }

    public Pegawai(String nama, int idPegawai, double gaji) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gaji = gaji;
    }

    public Pegawai(String nama, int idPegawai, double gaji, String tugas) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gaji = gaji;
        this.tugas = tugas;
    }

    public String batasan() {
        return "_______________________________________________";
    }

    public String getTugas() {
        return (tugas == null) ? "Melakukan pekerjaan umum" : tugas;
    }

    public String toString() {
        return "Nama : " + (nama == null ? "Nama" : nama) + "\nId Pegawai : " + idPegawai + "\nGaji : "
                + ((gaji % 1 == 0) ? String.format("%.0f", gaji) : Double.toString(gaji).replace('.', ','))
                + " Juta\nTugas : " + getTugas()
                + "\n" + batasan();
    }
}

class Manajer extends Pegawai {
    public Manajer(String nama) {
        super(nama, 1, 7);
    }

    @Override
    public String getTugas() {
        return "Melakukan manajemen untuk franchise";
    }
}

class Pelayan extends Pegawai {
    public Pelayan(String nama) {
        super(nama, 2, 1.2);
    }

    @Override
    public String getTugas() {
        return "Melakukan transaksi dengan pembeli";
    }
}

class Koki extends Pegawai {
    public Koki(String nama) {
        super(nama, 3, 2);
    }

    @Override
    public String getTugas() {
        return "Memasak makanan dan Membuat minuman";
    }
}

class Kasir extends Pegawai {
    public Kasir(String nama) {
        super(nama, 4, 1.2);
    }

    @Override
    public String getTugas() {
        return "Melayani dan Menyajikan pesanan pembeli";
    }
}

class Satpam extends Pegawai {
    public Satpam(String nama) {
        super(nama, 5, 1);
    }

    @Override
    public String getTugas() {
        return "Menjaga keamanan didalam dan diluar frenchise";
    }
}