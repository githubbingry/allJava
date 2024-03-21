/*
 * Nama     : M. Fazri Nizar
 * Kelas    : TI Reguler L1
 * NIM      : 09021282328053
 * Tugas    : Mengimplementasikan Soal UTS Menggunakan Konsep OOP (Inheritance & Polymorphism)
 * Nama File: Driver.java // Sesuai soal
 */

package DariKawan.Fazri.UTSPEMRO; // ganti atau hapus baris package ini jika dalam package lain/tidak dalam package apapun

public class Driver {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        String[][] dataPegawai = {
                { "sifa", "1" },
                { "Aldi", "2" },
                { "Reza", "3" },
                { "Dean", "4" },
                { "Aldi", "5" }
        };
        Pegawai[] pegawai = new Pegawai[dataPegawai.length];

        for (int i = 0; i < dataPegawai.length; i++) {
            String nama = dataPegawai[i][0];
            int idPegawai = Integer.parseInt(dataPegawai[i][1]);
        
            switch (idPegawai) {
                case 1:
                    pegawai[i] = new Manajer(nama);
                    break;
                case 2:
                    pegawai[i] = new Pelayan(nama);
                    break;
                case 3:
                    pegawai[i] = new Koki(nama);
                    break;
                case 4:
                    pegawai[i] = new Kasir(nama);
                    break;
                case 5:
                    pegawai[i] = new Satpam(nama);
                    break;
            }
        }
        
        System.out.println("Menampilkan nama, id pegawai, gaji dan tugas\n" + p1.batasan());
        for (Pegawai p : pegawai) {
            System.out.println(p);
        }
    }
}