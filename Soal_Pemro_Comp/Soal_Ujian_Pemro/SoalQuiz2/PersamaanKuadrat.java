package Soal_Pemro_Comp.Soal_Ujian_Pemro.SoalQuiz2;

public class PersamaanKuadrat {
    //a. datafield a b c representasi koefisien pers kuadrat
    private double a = 0;
    private double b = 0;
    private double c = 0;

    //b konstruktor parameter a b c
    public PersamaanKuadrat(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //c get method a b c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //d getDiscriminant
    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    //e 2 method getroot + -
    public double getRoot1(){
        if(getDiscriminant() < 0) return 0;
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getRoot2(){
        if(getDiscriminant() < 0) return 0;
        return (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }
}
