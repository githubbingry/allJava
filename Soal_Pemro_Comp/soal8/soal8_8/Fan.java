//another one
package Soal_Pemro_Comp.soal8.soal8_8                                                           ;
public class Fan                                                                                {
    static int  SLOW = 1                                                                        ,
                MEDIUM = 2                                                                      ,
                FAST = 3                                                                        ;
    private int speed = SLOW                                                                    ;
    private boolean on = false                                                                  ;
    private double radius = 5.0                                                                 ;
    private String color = "Blue"                                                               ;

    /*automating getter and setter using source action                                          */
    public int getSpeed()                                                                       {
        return speed                                                                            ;}
    public void setSpeed(int speed)                                                             {
        this.speed = speed                                                                      ;}
    public boolean isOn()                                                                       {
        return on                                                                               ;}
    public void setOn(boolean on)                                                               {
        this.on = on                                                                            ;}
    public double getRadius()                                                                   {
        return radius                                                                           ;}
    public void setRadius(double radius)                                                        {
        this.radius = radius                                                                    ;}
    public String getColor()                                                                    {
        return color                                                                            ;}
    public void setColor(String color)                                                          {
        this.color = color                                                                      ;}

    public Fan()                                                                                {}
    public String toString()                                                                    {
        return this.on
            ? String.format("""
                Fan Speed : %d(%s)
                Fan Color : %s
                Fan Radius : %f"""                                                              ,
                this.speed                                                                      ,
                this.speed == 1 ? "SLOW" : this.speed == 2 ? "MEDIUM" : "FAST"                  ,
                this.color                                                                      ,
                this.radius)
            : String.format("""
                Fan Color : %s
                Fan Radius : %f
                Fan is Off"""                                                                   ,
                this.color                                                                      ,
                this.radius)                                                                    ;}}
