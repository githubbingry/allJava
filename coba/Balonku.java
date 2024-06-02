package coba;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Balonku {
    public static void main(String[] args) {
        Balon b = new Balon();
        for (int i = 0; i < 5; i++) {
            nyanyiSitu(b, i);
        }
    }

    static void nyanyiSitu(Balon b, int i){
        System.out.printf(b.q.isEmpty()?
        "Balonku sudah habis!\n" :
        """
        Balonku ada %s, rupa-rupa warnanya
        %s
        Meletus balon %s, dor!
        Hatiku sangat kacau
        %s"""
        , b.angka[b.q.size()]
        , udin(b.q)
        , b.q.remove()
        , b.q.size() == 0 ? "Balonku sudah habis!\n" : "Balonku tinggal "+b.angka[b.q.size()]+"kupegang erat-erat\n"
        );
    }

    static String listBalon(Balon b){
        String s = "";
        for (int i = 0; i < b.q.size(); i++) {
            s += i == b.q.size()-1 ?
                "dan "+b.warnaBalon[b.warnaBalon.length-1] :
                b.warnaBalon[i+1]+", ";
        }
        for (String wb : b.q) {
            s += b.q.size() == 1 ? "Biru" : wb.equals("Biru") ? "dan " + wb : wb + ", ";
        }
        return s;
    }

    static String udin(Queue<String> q){
        String s = "";
        int size = q.size();
        int i = 0;
        for (String warna : q) {
            s += warna;
            if(i < size-2){
                s += ", ";
            } else if (size == 2 && i == 0){
                s += " dan ";
            } else if(i == size-2){
                s += ", dan ";
            }
            i++;
        }
        return s;
    }
}

class Balon{
    Queue<String> q = new LinkedList<>();
    String[] warnaBalon = {"Hijau", "Kuning", "Kelabu", "Merah Muda", "Biru"};
    String[] angka = {"nol", "satu", "dua", "tiga", "empat", "lima"};
    
    public Balon() {
        q.addAll(List.of(warnaBalon));
    }
}
