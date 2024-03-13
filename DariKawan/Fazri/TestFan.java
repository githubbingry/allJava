package DariKawan.Fazri;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.printf("%s\n%s\n", fan1.toString(), fan2.toString());

        System.out.println(new FanBuilder().setSpeed(Fan.FAST).setRadius(10).setColor("yellow").setOn(true).build().toString());
    }
}
