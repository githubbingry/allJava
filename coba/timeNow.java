package coba;

public class timeNow {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        
        long currentHour = totalHours % 24 + 7 ;
        
        if (currentHour >= 24)
            currentHour %= 24 ;
        else if (currentHour <= -24)
            currentHour %= -24 ;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
