package DariKawan.Zikri.Tugas_8_7dan8_8;

public class testAccount {
    public static void main(String[] args) {
        Account akun1 = new Account();
        akun1.setId(1122);
        akun1.setBalance(20_000);

        akun1.setAnnualInterestRate(4.5);
        akun1.withdraw(2500);
        akun1.deposit(3000);

        System.out.printf("The Balance = %1.0f \n", akun1.getBalance());
        System.out.printf("The monthly interest = %1.3f \n", akun1.getMonthlyInterest());
        System.out.println("The Date Created at = " + akun1.getDateCreated());
    }
}
