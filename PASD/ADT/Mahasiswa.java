package PASD.ADT;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String ps;
    private int angk;
    //const angk harus default jika keluar dari 2005-2023
    //setter angk batal
    public Mahasiswa(){
        this("Fachry Ghifary", "09021182328009", "Teknik Informatika", 2005);
    }

    public Mahasiswa(String nama, String nim, String ps, int angk){
        this.nama = nama;
        this.nim = nim;
        this.ps = ps;
        if(angk > 2004 && angk < 2024){
            System.out.println("Tahun angkatan valid");
            this.angk = angk;
        }else{
            System.out.println("Tahun angkatan tidak valid, tahun angkatan menjadi default(2005)");
            this.angk = 2005;
        }
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getPs() {
        return this.ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public int getAngk() {
        return this.angk;
    }

    public void setAngk(int angk){
        if (angk < 2005 || angk > 2023){
            System.out.println("Tahun angkatan tidak valid, perubahan gagal");
            return;
        }
        System.out.println("Tahun angkatan valid, perubahan berhasil");
        this.angk = angk;
    }
}
