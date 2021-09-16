public class CurrentAccount extends BankAccount {
    double cashCredit;
    public CurrentAccount(String name, String accountNumber, double balance, double cashCredit) {
        super(name, accountNumber, balance);
        this.cashCredit=cashCredit;
    }
    public double total(){
        return balance+cashCredit;
    }
}
