package Soal_Pemro_Comp.soal5;

public class soal5_9 {
    public static void main(String[] args) {
        double foot, meter;
        dash();
        System.out.println("Feet \t\t Meters \t | \t Meters \t  Feet");
        dash();
        for (double i = 0; i < 10; i++){
            foot = 1 + i;
            meter = 20 + i * 5;
            System.out.printf("%5.1f \t\t %5.3f \t\t | \t %5.1f \t\t%7.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
        }
        dash();
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static void dash(){
        System.out.println("----------------------------------------------------------------");
    }
}
