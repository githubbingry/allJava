package PASD.PRE_UAS;

public class Soal2 {
    
}
class JAM{
    int hh, mm, ss;
    public JAM(){
        this.hh = 0;
        this.mm = 0;
        this.ss = 0;
    }

    public int Hour(){
        return hh;
    }
    public int Minute(){
        return mm;
    }
    public int Second(){
        return ss;
    }

    public void setHH(int newHH){
        hh = newHH;
    }

    public void setMM(int newMM){
        mm = newMM;
    }

    public void setSS(int newSS){
        ss = newSS;
    }

    public static JAM DetikToJam(int n){
        JAM j = new JAM();
        j.setHH(n/3600);
        j.setSS(n-(3600*j.Hour()));
        j.setMM(j.Second()/60);
        j.setSS(j.Second() - (60*j.Minute()));
        return j;
    }
}

/*
Function MakeJam(j:JAM) -> JAM
    j.HH=0;
    j.MM=0;
    j.SS=0;
    return j;

Function Hour(j : JAM) -> int
    return j.HH;

Function Minute(j : JAM) -> int
    return j.MM;

Function Second(j : JAM) -> int
    return j.SS;

Procedure SetHH(j : JAM, newHH : int)
    j.HH = newHH;

Procedure SetMM(j : JAM, newMM : int)
    j.MM = newMM;

Procedure SetSS(j : JAM, newSS : int)
    j.SS = newSS;

Function DetikToJam(n : int) -> JAM
Deklarasi :
    j : JAM
Algoritma :
    j.HH = N/3600;
    j.SS = N-(3600*j.HH);
    j.MM = detik / 60;
    j.SS = j.SS - (60*j.MM);
    return j;
 */
