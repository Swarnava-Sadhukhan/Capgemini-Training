public class SavingsAccount extends BankAccount{
    double fixedDeposit;
    public SavingsAccount(String name, String accountNumber, double balance, double fixedDeposit) {
        super(name, accountNumber, balance);
        this.fixedDeposit=fixedDeposit;
    }
    public double total(){
        return balance+fixedDeposit;
    }
}
