package coba;

public class cobaUASPemro {
    public static void main(String[] args) {
        
    }
}

//soal 2 di file Latihan UAS
class Gelembung {
  private int total=10; //hanya bisa diakses kelas ini sendiri

  void tiupGelembung() {
    total++;
  }
  void pecahkanGelembung() {
    total--; //gelembung berkurang 1
  }
  void printGelembung() {
    System.out.println("Ada "+total+" Gelembung!");
  }
}

class Gelembungku {
  public static void main(String[] argus) {
    Gelembung gelo = new Gelembung(); //instansiasi objek
    for(int i=0; i<5; i++)
      gelo.tiupGelembung();
    //tambah 5 gelembung baru

    gelo.printGelembung(); //tampilkan jumlah gelembung skrg
  }
}

class Balon {
  private int total=3;

  void tambah() {
    total++;
  }
  void kurang() {
    total--;
  }
  void printBalon() {
    System.out.println("Total="+total);
  }
}

class Balonku {
    public static void main(String[] argus) {
      Balon bal = new Balon();
      for(int i=0; i<2; i++)
        bal.kurang();
  
      bal.printBalon();
    }
  }
  