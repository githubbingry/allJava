package PASD.ADT;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa udin = new Mahasiswa("udin", "09021182328009", "Teknik Informatika", 1);
        System.out.println(udin.getAngk());
        udin.setAngk(2023);
        System.out.println(udin.getAngk());
        udin.setAngk(2050);
        System.out.println(udin.getAngk());
    }
}
