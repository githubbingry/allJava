package DariKawan.Zikri.Tugas_8_7dan8_8;

public class Account{
    // * Tugas 8.7 halaman 364
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    Account(){
        this(0, 0);
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    // * Assesor Methods
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // * Mutator Methods
    public void setId(int newID) {
        this.id = newID;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
    }

    // * Method yang return monthly interest rate
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100) / 12;
    }

    // * Method yang return monthly interest
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    // * METHOD YANG MENGEMBALIKAN JUMLAH SPESIFIK DARI ACCOUNT SAAT WITHDRAW
    public double withdraw(double amount){
        return balance -= amount;
    }

    // * METHOD YANG MENGEMBALIKAN JUMLAH DEPOSIT ACCOUNT
    public double deposit(double amount){
        return balance += amount;
    }

}