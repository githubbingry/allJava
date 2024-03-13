package DariKawan.Fazri;

public class Fan {
    static final int SLOW = 1, MEDIUM = 2, FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return this.on
                ? "Fan speed: " + this.speed + " ("
                        + (this.speed == FAST ? "FAST" : this.speed == MEDIUM ? "MEDIUM" : "LOW") + ")"
                        + ", color: " + this.color + ", radius: " + this.radius
                : "Fan color: " + this.color + ", radius: " + this.radius + ", fan is off";
        // return getOn()
        // ? "Fan speed: " + getSpeed() + " ("
        // + (getSpeed() == FAST ? "FAST" : getSpeed() == MEDIUM ? "MEDIUM" : "LOW") +
        // ")" + ", color: "
        // + getColor() + ", radius: " + getRadius()
        // : "Fan color: " + getColor() + ", radius: " + getRadius() + ", fan is off";
    }
}
