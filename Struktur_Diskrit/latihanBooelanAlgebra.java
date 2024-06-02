package Struktur_Diskrit;

import java.util.Scanner;

public class latihanBooelanAlgebra {
    /*
    Operasi Logika :
    and (p ∧ q) <=> p & q
    or (p V q) <=> p | q
    xor (p ⊕ q) <=> p ^ q
    not (~p) <=> p == 1 ? 0 : 1 (buat method not(p))

    Logika Implikasi : (buat method imp(a, b))
    a -> b
    <=> ~a V b <=> not(a) | b

    Logika Bi-implikasi : (buat method bimp(a, b))
        a <-> b
    <=> (a -> b) ∧ (b -> a) <=> imp(a,b) & imp(b,a)
    <=> (~a V b) ∧ (~b V a) <=> (not(a) | b) & (not(b) | a)
    <=> ~(p ⊕ q) <=> not(p ^ q)

    Hukum Logika :
    - identitas :

     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        char c = x.next().charAt(0); //soal 1.a-e
        int p, q, r;
        switch (c) { //tentukan apakah persamaan boolean ini tautologi/kontradiksi/bukan keduanya
            case 'a': // ~(p V ~q) V p, bukan keduanya yaitu p V q
                for(p = 1; p >= 0; p--){
                    for(q = 1; q >= 0; q--){
                        System.out.println((not(p | not(q)) | p ) + " " + (p | q));
                    }
                }
                break;
        
            case 'b': // [p -> (p ∧ q)] -> ~q, bukan keduanya yaitu ~q
                for(p = 1; p >= 0; p--){
                    for(q = 1; q >= 0; q--){
                        System.out.println(imp(imp(p, (p | q)), not(q)) + " " + not(q));
                    }
                }
                break;

            case 'c': // (p ∧ q) <-> (~p V ~q), kontradiksi
                for(p = 1; p >= 0; p--){
                    for(q = 1; q >= 0; q--){
                        System.out.println(bimp((p & q), (not(p) | not(q))) + " " + 0);
                    }
                }
                break;

            case 'd': // [(p ∧ r) V (q ∧ r)] -> (p -> r), bukan keduanya yaitu ~p V ~r
                for(p = 1; p >= 0; p--){
                    for(q = 1; q >= 0; q--){
                        for(r = 1; r >= 0; r--){
                            System.out.println(imp((p & r) | (q & r), imp(p, not(r))) + " " + (not(p) | not(r)));
                        }
                    }
                }
                break;
            
            case 'e': // (~q -> p) -> (p -> ~q), bukan keduanya yaitu ~(p ∧ q)
                for(p = 1; p >= 0; p--){
                    for(q = 1; q >= 0; q--){
                        System.out.println(imp(imp(not(q), p), imp(p, not(q))) + " " + not(p & q));
                    }
                }
                break;
            default:
            System.out.println("blom ad soal laen wak");
                break;
        }
        x.close();
    }

    private static int not(int a){return a == 1 ? 0 : 1;}
    private static int imp(int a, int b){return not(a) | b;}
    private static int bimp(int a, int b){return not(a^b);}
}
