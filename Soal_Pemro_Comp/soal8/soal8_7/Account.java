// a little bit of trolling, defo a good oop code
package Soal_Pemro_Comp.soal8.soal8_7                                               ;
import java.util.Date                                                               ;
public class Account                                                                {
    private int id = 0                                                              ;
    private double balance = 0.0                                                    ;
    private double annualInterestRate = 0.0                                         ;
    private Date dateCreated = new Date()                                           ;

    public Account()                                                                {}

    public Account(int id, double balance, double annualInterestRate)               {
        this.id = id                                                                ;
        this.balance = balance                                                      ;
        this.annualInterestRate = annualInterestRate/100                            ;}

    // public Account(int id, double balance, double annualInterestRate){
    //     this(id, balance, annualInterestRate);
    // }

    public int getId()                                                              {
        return id                                                                   ;}

    public double getBalance()                                                      {
        return balance                                                              ;}

    public double getAnnualInterestRate()                                           {
        return annualInterestRate                                                   ;}

    public void setId(int id)                                                       {
        this.id = id                                                                ;}

    public void setBalance(double balance)                                          {
        this.balance = balance                                                      ;}

    public void setAnnualInterestRate(double annualInterestRate)                    {
        this.annualInterestRate = annualInterestRate/100                            ;}

    public java.util.Date getDateCreated()                                          {
        return dateCreated                                                          ;}

    public double getMonthlyInterestRate()                                          {
        return this.annualInterestRate / 12                                         ;}
    
    public double getMonthlyInterest()                                              {
        return getMonthlyInterestRate() * balance                                   ;}

    public double withdraw(double amount)                                           {
        /*there's no constraint in the problem,
        but I'll just make condition the amount must not be negative
        and the amount must be less or equal than balance*/
        if (amount < 0 || amount > balance)                                         {
            System.out.println("Error")                                           ;
            return 0                                                                ;}
        balance -= amount                                                           ;
        return amount                                                               ;}

    public void deposit(double amount)                                              {
        /*there's no constraint in the problem,
        but I'll just make condition the amount must not be negative*/
        if (amount >= 0) balance += amount                                         ;}
}
