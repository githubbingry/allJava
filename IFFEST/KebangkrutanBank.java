package IFFEST;

import java.util.Scanner;

public class KebangkrutanBank {

  static final int idBank = 0;
  static final int nilaiPinjam = 1;
  static double[][][] mBanks;
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    //   System.out.print("Masukkan Jumlah Bank: ");
      int n = input.nextInt(); 
    //   System.out.print("Masukkan Limit Minimum: ");
      int limit = input.nextInt(); 

      mBanks = new double[n][][];

      for (int i = 0; i < mBanks.length; i++) {
        //   System.out.print("Bank "+i+" > ");
          double saldo = input.nextDouble();
          int jmlhBank = input.nextInt();
          mBanks[i] = new double[++jmlhBank][2];
          mBanks[i][0][0] = saldo;  //menyimpan saldo bank

          //input bank peminjam dan nilai Pinjam
          for (int peminjam = 1; peminjam < mBanks[i].length; peminjam++) {
              mBanks[i][peminjam][idBank] = input.nextDouble();
              mBanks[i][peminjam][nilaiPinjam] = input.nextDouble();
          }
      }
      
    boolean[] BankTidakAman = scanBank(mBanks, limit);

      //Menampilkan hasil Pengecekan Bank
    if (allSafe(BankTidakAman))
        System.out.println("Semua Bank Aman");

    else if (allUnSafe(BankTidakAman))
        System.out.println("Semua Bank Tidak Aman");

    else {
        for (int i = 0; i < BankTidakAman.length; i++) {
          if(BankTidakAman[i])
            System.out.print(i + " ");
        }
      }
      input.close();
    }
  
  //Function cek apakah setiap bank dalam kondisi tidak aman
  public static boolean[] scanBank(double[][][] m, int limit) {
      boolean[] BankTidakAman = new boolean[m.length];
      double total;
      boolean aman = false;
      //Melakukan looping sampai BankTidakAman Diperbarui
      while (!aman) {
          aman = true; // set aman menjadi false jika BankTidakAman dirubah 
          for (int bank = 0; bank < m.length; bank++) {
              total = m[bank][0][0];
              for (int peminjam = 1; peminjam < m[bank].length; peminjam++) {
                  int bankPeminjam = (int)m[bank][peminjam][idBank];
                  if (!BankTidakAman[bankPeminjam]) //Jika bank yang meminjam dalam kondisi tidak aman
                      total += m[bank][peminjam][nilaiPinjam]; //maka bank pinjaman tidak dapat menghitung pinjaman dalam asset
              }

              //Perbarui array BankTidakAman jika total saldo bank kurang dari limit 
              //dan bank belum di tandai tidak aman (BankTidakAman[bank] = true)
              if (total < limit && !BankTidakAman[bank]) {
                  BankTidakAman[bank] = true;
                  aman = false;
              }
          }
      }
      return BankTidakAman;
  }

  //Function Cek Semua Bank Aman
  public static boolean allSafe (boolean[] bank) {
    for (int i=0; i<bank.length ;i++) {
        if (bank[i])
            return false;
    }
            return true;
  }

  //Function Cek Semua Bank Tidak Aman
  public static boolean allUnSafe (boolean[] bank) {
    for (int i=0; i<bank.length ;i++) {
        if (!bank[i])
            return false;
    }
            return true;
  }
}