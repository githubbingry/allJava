package Soal_Pemro_Comp.soal5;

public class soal5_14 {
    public static void main(String[] args) {
        double m_i = 0, a;
        dash();
        System.out.println("  i \t\t  m(i)");
        dash();
        for (double i = 0; i < 10; i++){
            a = 1 + 100000 * i;
            m_i = m(a);
            System.out.printf("%3.0f \t\t%1.5f\n", a, m_i);
        }
        dash();
    }
    public static double m(double a){
        double m_i = 0;
        for (int i = 1; i <= a; i++){
            m_i += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return m_i * 4;
    }
    public static void dash(){
        System.out.println("------------------------");
    }
}
