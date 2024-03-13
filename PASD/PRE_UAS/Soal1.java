package PASD.PRE_UAS;

public class Soal1 {
    public static void main(String[] args) {
        int[] ar = {-2, 9, 0, 1, 743, -2342};
        int maks = maks1(ar);
        int min = min1(ar);
        int jangkauan = HitungJangkauan(maks, min);
        Print(maks, min, jangkauan);
    }

    static int maks1(int[] ar){
        int i, besar = ar[0];
        for (i = 1; i < 5; i++){
            besar = (besar > ar[i]) ? besar : ar[i];
        }
        /*
        if (besar > ar[i]) besar = besar;
        else besar = ar[i];
         */
        return besar;
    }

    static int maks2(int[] ar){
        int i, besar = 0;
        for (i = 0; i < 5; i++){
            if (i == 0){
                besar = ar[i];
            } else if (besar < ar[i]){
                besar = ar[i];
            }
        }
        return besar;
    }

    static int min1(int[] ar){
        int i, kecil = 0;
        for (i = 0; i <= 5; i++){
            if (i == 0){
                kecil = ar[i];
            } else {
                if (kecil > ar[i]){
                    kecil = ar[i];
                }
            }
        }
        return kecil;
    }
    static int min2(int[] ar){
        int i, kecil = 0;
        for (i = 0; i <= 5; i++){
            if (i == 0){
                kecil = ar[i];
            } else if (kecil > ar[i]){
                kecil = ar[i];
            }
        }
        return kecil;
    }

    static int HitungJangkauan(int besar, int kecil){
        return besar - kecil;
    }

    static void Print(int besar, int kecil, int jangkauan){
        System.out.print("Nilai terbesar = "+besar+"\nNilai terkecil = "+kecil+"\nJangkauan = "+jangkauan);
    }
}
/*
Program HitunganJangkauan
Deklarasi :
ar : array[50] of int
maks, min, jangkauan : int
Algoritma:
ar = {-2, 9, 0, 1, 743, -2342};
maks = maks1(ar);
min = min1(ar);
jangkauan = HitungJangkauan(maks, min);
Print(maks, min, jangkauan);
End Program

Function Maks(ar : array[50] of int) -> int
Deklarasi:
i, besar : int
Algoritma :
besar = ar[0];
for (i <- 1; i < 50; i++) do
    if (besar < ar[i]) then
        besar = ar[i];
    end if
end for
return besar;
End Function

Function Min(ar : array[50] of int) -> int
Deklarasi:
i, kecil : int
kecil2 : array[5] of int
Algoritma :
kecil = ar[i];
for (i <- 0; i < 50; i++) do
    if (kecil > ar[i]) then
        kecil = ar[i];
    end if
end for
return kecil;
End Function

Function HitungJangkauan(besar, kecil : int) -> int
return besar - kecil;
End function

Procedure Print(besar, kecil, jangkauan : int)
write("nilai terbesar adalah ", besar, "\nnilai terkecil adalah ", kecil,"\nJangkauannya adalah ", jangkauan)
End Procedure
 */