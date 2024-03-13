package coba;

// import java.util.Scanner;

public class testFranchise {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        franchise f = new franchise("udin", 1);
        System.out.println(f.toString());

        franchise f1 = new franchise("sifa", 1);
        franchise f2 = new franchise("Aldi", 2);
        franchise f3 = new franchise("Reza", 3);
        franchise f4 = new franchise("Dean", 4);
        franchise f5 = new franchise("Aldi", 2);

        System.out.println("Menampilkan nama, id pegawai, gaji dan tugas");
        System.out.println("-------------------------------");
        System.out.println(f1.toString());
        System.out.println("-------------------------------");
        System.out.println(f2.toString());
        System.out.println("-------------------------------");
        System.out.println(f3.toString());
        System.out.println("-------------------------------");
        System.out.println(f4.toString());
        System.out.println("-------------------------------");
        System.out.println(f5.toString());
        System.out.println("-------------------------------");
        

        // franchise[] pegawai = new franchise[5];
        // for (int i = 0; i < pegawai.length; i++){
        //     pegawai[i] = new franchise(scan.next(), scan.nextInt());
        // }
        // scan.close();

        // System.out.println("-------------------------------");
        // for (int i = 0; i < pegawai.length; i++){
        //     System.out.println(pegawai[i].toString());
        //     System.out.println("-------------------------------");
        // }
    }
}
