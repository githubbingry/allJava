package Soal_Pemro_Comp.soal5;

public class soal5_8 {
    public static void main(String[] args) {
        double fahrenheit, celcius;
        dash();
        System.out.println("Celcius \t Fahrenheit \t | \t Fahrenheit \t Celcius");
        dash();
        for (int i = 0; i < 10; i++){
            celcius = 40 - i;
            fahrenheit = 120 - i * 10;
            System.out.printf("%5.1f \t\t %5.1f \t\t | \t %5.1f \t\t %5.2f\n", celcius, celsiusToFahrenheit(celcius), fahrenheit, fahrenheitToCelcius(fahrenheit));
        }
        dash();
    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelcius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    public static void dash(){
        System.out.println("----------------------------------------------------------------");
    }
}
