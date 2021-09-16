public class BankAccount {
    String name;
    String accountNumber;
    double balance;
    public BankAccount(String name, String accountNumber, double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public double total(){
        return balance;
    }
}
