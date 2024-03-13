// quite fun actually
package Soal_Pemro_Comp.soal8.soal8_7                                                                       ;
public class testAccount                                                                                    {
    public static void main(String[] args)                                                                  {
        Account a = new Account(1122, 20000, 4.5)                             ;
        System.out.println("You Withdraw : $"+a.withdraw(2500))                                      ;
        a.deposit(3000)                                                                              ;
        System.out.printf("""
            Your Balance : $%f
            Your Monthly Interest : $%f
            You made your account on %s
            """, a.getBalance(), a.getMonthlyInterest(), a.getDateCreated()                                 );}}
