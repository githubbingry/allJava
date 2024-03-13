package Soal_Pemro_Comp.soal5;

public class soal5_13 {
    public static void main(String[] args) {
        double m_i = 0;
        dash();
        System.out.println("  i \t\t    m(i)");
        dash();
        for (double i = 1; i < 21; i++){
            m_i += m(i);
            System.out.printf("%3.0f \t\t%10.4f\n", i, m_i);
        }
        dash();
    }
    public static double m(double i){
        return i / (i + 1);
    }
    public static void dash(){
        System.out.println("----------------------------");
    }
}
