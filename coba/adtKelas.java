package coba;

import java.util.Scanner;

public class adtKelas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] ar = new char[n][n];
        for (int i = 0; i<n ; i++){
            for (int j = 0; j <n; j++){
                ar[i][j] = '*';
            }
        }
        
        for (int i = 0; i<n ; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }

    /*
    Function HitungLuas(pp : PersegiPanjang) -> PersegiPanjang
        return 2 * pp.l * pp.p;
    End Function

    Function isiJam(j : JAM) -> JAM
        read(j.HH);
        read(j.MM);
        read(j.SS);
        return j;
    End Function

    Function HitungDetik(j : JAM) -> JAM
        return j.SS;
    End Function

    Procedure isiJam2(j :JAM)
        read(j.HH);
        read(j.MM);
        read(j.SS);
    End Procedure
     */
}
/*
kelas l1 terdapat 26 mahasiswa, kelas l2 adaa 30

Program Kelas
Deklarasi :
    Type Mahasiswa <Nama, NIM : String>
    Mahasiswas : array[26] of Mahasiswa
    Kelas : array[3][30] of String
    i, j : int
Algoritma :
    for i <- 1 to 3 do
        for j <- 1 to 30 do
            read(Kelas[i][j]);
        end for
    end for
    

    for i <- 1 to 26 do
        read(Mahasiswas[i].Nama);
        read(Mahasiswas[i].NIM);
    end for
End Program

Procedure printMahasiswa(m : Mahasiswa)
    writeln(m.Nama);
    writeln(m.NIM);
End Procedure

Function isiMahasiswa(m : Mahasiswa) -> Mahasiswa
    read(m.Nama);
    read(m.NIM);
    return m;
End Function
-------------------------------

Program Tahun
Deklarasi :
    Type Tanggal <tahun, bulan, hari : int>
    tanggals : array[365] of Tanggal
    ts : Tanggal
    i : int
Algoritma :
    for i <- 0 to 365 do
        isiTanggal(tanggals[i]);
    end for
    
    ts.tahun = 2023;
    ts.bulan = 11;
    ts.hari = 9;

    displayTanggal(ts);

    for i <- 0 to 365 do
        displayTanggal(tanggals[i]);
    end for

End Program

Function isiTanggal(t : Tanggal) -> Tanggal
    read(t.tahun);
    read(t.bulan);
    read(t.hari);
    return t;
End Function

Procedure displayTanggal(t : Tanggal)
    writeln(t.tahun);
    writeln(t.bulan);
    writeln(t.hari);
End Procedure



















 */