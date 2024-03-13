package PASD.ADT;

import java.util.Scanner;

class Jam {
    int jam, menit, detik;

    public Jam(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public String getString(){
        return this.jam + " jam " + this.jam + " menit " + this.detik + " detik";
    }
}
public class Program5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Jam j = new Jam(0, 0 , 0);
        Jam[] JamArr = new Jam[5];
        System.out.println(j);

        System.out.print("Masukkan JamArr ke 1 : ");
        do{
            JamArr[0].jam = x.nextInt();
            JamArr[0].menit = x.nextInt();
            JamArr[0].detik = x.nextInt();
            if (!isValid(JamArr[0])) System.out.println("Tidak valid, masukkan JamArr ke 1 sekali lagi : ");
        } while (!isValid(JamArr[0]));

        for (int i = 1; i < 5; i++){
            do{
                System.out.print("Masukkan JamArr ke "+ (i+1) +" : ");
                JamArr[i].jam = x.nextInt();
                JamArr[i].menit = x.nextInt();
                JamArr[i].detik = x.nextInt();
                if (!isValid(JamArr[i])) System.out.println("Tidak valid, masukkan JamArr ke "+ (i+1) +" sekali lagi : ");
            } while (!isValid(JamArr[i]));
        }

        System.out.println("List JamArr : ");
        for (int i = 0; i < 5; i++){
            cetak(JamArr[i]);
        }
        
        System.out.println("List konversi jam ke detik : ");
        for (int i = 0; i < 5; i++){
            System.out.println(Konversi(JamArr[i]));;
        }

        x.close();
    }

    public static boolean isValid(Jam JamArr){
        if (JamArr.jam <= 0 || JamArr.jam > 23 || JamArr.menit <= 0 || JamArr.menit > 59 || JamArr.detik <= 0 || JamArr.detik > 59)
            return false;
        return true;
    }

    public static void cetak(Jam JamArr){
        System.out.println(JamArr.jam + "jam " + JamArr.menit + " menit " + JamArr.detik + " detik");
    }

    public static int Konversi(Jam JamArr){
        return JamArr.jam * 3600 + JamArr.menit * 60 + JamArr.detik;
    }
}

/*

Program JamArr

Deklarasi :
    Type JamArr <jam : int, menit : int, detik : int>
    jamArr : array [5] of JamArr
    i : int

Algoritma :
    read(JamArr.jam);
    read(JamArr.detik);
    read(JamArr.menit);
    if (isValid(JamArr)) then
        jamArr[0] = (JamArr.jam, JamArr.detik, JamArr.menit)
    End if

    for (int i = 1; i < 5; i++) do
        read(JamArr.jam);
        read(JamArr.detik);
        read(JamArr.menit);
        if (isValid(JamArr)) then
            jamArr[i] = (JamArr.jam, JamArr.detik, JamArr.menit);
        End if
    End for

    for (int i = 0; i < 5; i++) do
        cetak(JamArr);
    End for

    for (int i = 0; i < 5; i++) do
        writeln(Konversi(jamArr[i]));
        writeln();
    End for

End Program

Function Konversi(JamArr : JamArr) -> integer
    return JamArr.jam * 3600 + JamArr.menit * 60 + JamArr.detik;
End Function

Procedure Cetak(JamArr : JamArr)
    write(JamArr.jam);
    write(JamArr.menit);
    write(JamArr.detik);
    writeln();
End Procedure

Function isValid(JamArr : JamArr) -> JamArr
    if (JamArr.jam <= 0 || JamArr.jam > 23 || JamArr.menit <= 0 || JamArr.menit > 59 || JamArr.detik <= 0 || JamArr.detik > 59) then
        return false;
    return true;
End Function

 */