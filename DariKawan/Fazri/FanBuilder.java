package DariKawan.Fazri;

public class FanBuilder {
    private Fan fan = new Fan();

    public FanBuilder setSpeed(int speed) {
        fan.setSpeed(speed);
        return this;
    }

    public FanBuilder setOn(boolean on) {
        fan.setOn(on);
        return this;
    }

    public FanBuilder setRadius(double radius) {
        fan.setRadius(radius);
        return this;
    }

    public FanBuilder setColor(String color) {
        fan.setColor(color);
        return this;
    }

    public Fan build() {
        return fan;
    }
}
