package DariKawan.Zikri.Tugas_8_7dan8_8;

public class Fan{
    // static int SLOW = 1;
    // static int MEDIUM = 2;
    // static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(){
        this(1, false, 5.0, "blue");
    }

    Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // * Accessor Methods
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // * Accessor Methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // * Method toString() untuk mendeskripsikan Object Fan yang dibuat
    public String toString(){
        if(on){
            return "The Fan Speed : " + getSpeed() + " , color : " + getColor() + ", and radius : " + getRadius();
        }else{
            return "The Fan color : " + getColor() + ", and radius : " + getRadius() + " . Fan is Off!";
        }
    }
    

    
}