package PASD.ADT;

import java.util.Scanner;

class Karyawan {
    private String nama;
    private String jenis;
    private String email;
    private String nomorHP;
    private int gajiPokok;
    private int lamaHariKerja;
    private int lamaLembur;

    public Karyawan(String nama, String jenis, String email, String nomorHP, int lamaHariKerja, int lamaLembur) {
        this.nama = nama;
        this.jenis = jenis;
        this.email = email;
        this.nomorHP = nomorHP;
        this.gajiPokok = getGajiPokok(jenis);
        this.lamaHariKerja = lamaHariKerja;
        this.lamaLembur = lamaLembur;
    }

    public String getNama() {return nama;}
    public String getJenis() {return jenis;}
    public String getEmail() {return email;}
    public String getNomorHP() {return nomorHP;}
    public int getGajiPokok() {return gajiPokok;}
    public int getLamaHariKerja() {return lamaHariKerja;}
    public int getLamaLembur() {return lamaLembur;}
    private int getGajiPokok(String jenisKaryawan) {
        switch (jenisKaryawan.toLowerCase()) {
            case "kasir":
                return 5000000;
            case "bartender":
                return 4000000;
            case "cleaning service":
                return 3000000;
            default:
                return -1;
        }
    }
}

public class Makalah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Karyawan[] karyawanArray = new Karyawan[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan data karyawan ke-" + (i + 1));
            karyawanArray[i] = inputKaryawan(scanner, karyawanArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            displayPendapatan(karyawanArray[i]);
        }
    }

    public static Karyawan inputKaryawan(Scanner scanner, Karyawan k) {
        System.out.print("Nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis karyawan (kasir/bartender/cleaning service): ");
        String jenis = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.next();

        System.out.print("Nomor HP: ");
        String nomorHP = scanner.next();

        System.out.print("Lama hari kerja untuk " + k.getNama() + ": ");
        int lamaKerja = scanner.nextInt();

        System.out.print("Lama lembur (jam) untuk " + k.getNama() + ": ");
        int lamaLembur = scanner.nextInt();

        return new Karyawan(nama, jenis, email, nomorHP, lamaKerja, lamaLembur);
    }

    // Procedure untuk mendisplay pendapatan dari suatu karyawan
    public static void displayPendapatan(Karyawan k) {
        System.out.println("\nData Karyawan " + k.getNama());
        System.out.println("Nama: " + k.getNama());
        System.out.println("Jenis Karyawan: " + k.getJenis());
        System.out.println("Email: " + k.getEmail());
        System.out.println("Nomor HP: " + k.getNomorHP());

        int lamaKerja = k.getLamaHariKerja();
        int lamaLembur = k.getLamaLembur();
        int upahHarian = 20000;
        int upahLembur = 25000;

        int pendapatanHarian = lamaKerja * upahHarian;
        int pendapatanLembur = lamaLembur * upahLembur;

        int pendapatanTotal = k.getGajiPokok() + pendapatanHarian + pendapatanLembur;
        System.out.println("Pendapatan Total: " + pendapatanTotal);
    }
}


/*
Tujuan :
1. Untuk mengetahui apa itu ADT
2. Untuk mengetahui fungsi dari ADT
3. Untuk mengetahui struktur dasar ADT
4. Untuk mengetahui bagaimana cara menyelesaikan masalah menggunakan ADT

Fungsi :
1. Mahasiswa dapat mengetahui apa itu ADT
2. Mahasiwa dapat mengetahui fungsi dari ADT
3. Mahasiswa dapat mengetahui struktur dasar ADT
4. Mahasiswa dapat mengetahui bagaimana cara menyelesaikan masalah menggunakan ADT

Soal :
Sebuah café memiliki 3 jenis karyawan yaitu kasir, bartender, dan cleaning service. Kasir digaji 5 juta perbulan, bartender digaji 4 juta perbulan, dan cleaning service digaji 3 juta perbulan. Setiap hari mereka bekerja, mereka mendapatkan upah 20 ribu perhari dan apabila dia lembur, dia akan mendapatkan upah 25 ribu perjamnya.
Buatlah :
1. Program untuk menginput 10 data karyawan di café tersebut,
5. Procedure untuk mendisplay pendapatan dari suatu karyawan.

Jawaban :

Program Karyawan_Café
Deklarasi :
Type Karyawan < Nama : String, Jenis_Karyawan : String, Email : String, No_HP : int,
                Gaji_Pokok : int, Lama_Hari_Kerja : int, Lama_Lembur : int >
Pegawai : array[10] of Karyawan
i : int
Algoritma :
for (i = 0; i < 10; i++) do
    Data_Karyawan(Pegawai[i]);
    Gaji_Pokok_Karyawan(Pegawai[i]);
    Hari_Kerja_Karyawan(Pegawai[i]);
    Display_Pendapatan_Karyawan(Pegawai[i]);
End for
End Program

read(k.Nama);
read(k.Jenis_Karyawan);
read(k.Email);
read(k.No_HP);
return k;

if (k.Jenis_Karyawan == "Kasir")
    k.Gaji_Pokok = 5000000;
else if (k.Jenis_Karyawan == "Bartender")
    k.Gaji_Pokok = 4000000;
else if (k.Jenis_Karyawan == "Cleaning Service")
    k.Gaji_Pokok = 3000000;
else
    k.Gaji_Pokok = -1;
End if

//k.Gaji_Pokok =(k.Jenis_Karyawan == "Kasir") ? 5000000 :
                (k.Jenis_Karyawan == "Bartender") ? 4000000 :
                (k.Jenis_Karyawan == "Cleaning Service") ? 3000000 : -1;
return k;

read(k.Lama_Hari_Kerja);
read(k.Lama_Lembur);
return k;

Procedure Display_Pendapatan_Karyawan(k : Karyawan)
writeln ("Pendapatan karyawan ", k.Nama, "sebesar Rp.",
        (k.Gaji_Pokok + k.Lama_Hari_Kerja * 20000 + k.Lama_Lembur * 25000));
End Procedure
 */