package DariKawan.Juseia;

public class Prosedur {
    public static void main(String[] args) {
        int[] a = {0,1,1,0,0,0,1,1,0,1,0,1};
        HitungMuncul(a, 12);
    }

    static void HitungMuncul(int[] a, int n){
        int freq = 0;
        for (int i = 0; i < n; i++){
            if (a[i] == 1){
                freq++;
            }
        }
        System.out.println("Banyak angka 1 sebanyak "+ freq);
    }
}

/*
Prosedur HitungMuncul1()
Deklarasi :
    A : array[N] of int
    i, N, freq : int
Algoritma :
    freq <- 0;
    for (i <- 0; i < N; i++) do
        if (A[i] == 1) then
            freq++;
        end if
    end for
        writeln("Banyak angka 1 sebanyak ", freq)
End Prosedur

Prosedur HitungMuncul2(N : int, A : array[N] of int)
Deklarasi :
    i, freq : int
Algoritma :
    freq <- 0;
    for (i <- 0; i < N; i++) do
        if (A[i] == 1) then
            freq++;
        end if
    end for
    writeln("Banyak angka 1 sebanyak ", freq)
End Prosedur


 */