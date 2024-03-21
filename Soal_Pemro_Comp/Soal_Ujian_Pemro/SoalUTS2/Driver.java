package Soal_Pemro_Comp.Soal_Ujian_Pemro.SoalUTS2;

public class Driver {
    public static void main(String[] args) {
        //5 pegawai
        Pegawai[] pegawai = new Pegawai[5];

        //1 sifa manajer
        pegawai[0] = new Manajer("sifa");
        //2 aldi pelayan
        pegawai[1] = new Pelayan("Aldi");
        //3 reza koki
        pegawai[2] = new Koki("Reza");
        //4 dean kasir
        pegawai[3] = new Kasir("Dean");
        //5 harusnya andi sebagai satpam
        pegawai[4] = new Satpam("Andi");
        
        //print text
        System.out.println("Menampilkan nama, id pegawai, gaji dan tugas");
        printDash();
        //looping print tiap pegawai
        for (Pegawai p : pegawai) {
            System.out.println(p);
            printDash();
        }

    }

    //print dash/batas
    static void printDash(){
        System.out.println("-----------------------------------------------------------");
    }
}
