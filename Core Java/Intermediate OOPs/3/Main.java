public class Main {
    public static void main(String[] args) {
        System.out.println("Curent Account Details: ");
        CurrentAccount c=new CurrentAccount("Harish", "1234567890", 25000.00, 1000.00);
        System.out.println("Account Holder Name: "+c.name);
        System.out.println("Account Number: "+c.accountNumber);
        System.out.println("Total Account Balance: "+c.total());
        System.out.println("===================================");
        System.out.println("Savings Account Details: ");
        SavingsAccount s=new SavingsAccount("Ramesh", "0987654321", 75000.00, 3000.00);
        System.out.println("Account Holder Name: "+s.name);
        System.out.println("Account Number: "+s.accountNumber);
        System.out.println("Total Account Balance: "+s.total());
    }
}
