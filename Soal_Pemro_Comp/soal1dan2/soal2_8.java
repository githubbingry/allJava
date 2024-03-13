package Soal_Pemro_Comp.soal1dan2;
import java.util.Scanner;

public class soal2_8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the time zome offset to GMT :");
        int offset = x.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        
        if (offset < -12)
            offset %= -12 ;
        else if (offset > 12)
            offset %= 12 ;
        
        long currentHour = totalHours % 24 + offset ;
        
        if (currentHour >= 24)
            currentHour %= 24 ;
        else if (currentHour <= -24)
            currentHour %= -24 ;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        x.close();
    }
}
