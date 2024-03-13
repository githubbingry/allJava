//last one
package Soal_Pemro_Comp.soal8.soal8_8                                           ;
public class testFan                                                            {
    public static void main(String[] args)                                      {
        Fan f1 = new Fan()                                                      ;
        f1.setSpeed(Fan.FAST)                                                   ;
        f1.setRadius(10)                                                 ;
        f1.setColor("Yellow")                                             ;
        f1.setOn(true)                                                       ;
        System.out.println(f1.toString())                                       ;

        Fan f2 = new Fan()                                                      ;
        f2.setSpeed(Fan.MEDIUM)                                                 ;
        System.out.println(f2.toString())                                       ;}}
