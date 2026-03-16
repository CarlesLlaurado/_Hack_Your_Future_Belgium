package projects.project2;

public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Insert some amount please");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdraw a correct amount please");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("0000", 850);
        SavingsAccount savingsAccount = new SavingsAccount("1111", 1000, 5);
        CheckingAcount checkingAcount = new CheckingAcount("2222", 4000, 500);

        bankAccount.deposit(500);
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());

        savingsAccount.setInterestRate(10);
        savingsAccount.applyInterest();
        System.out.println(savingsAccount.getAccountNumber());
        System.out.println(savingsAccount.getBalance());

        checkingAcount.withdraw(4500);
        System.out.println(checkingAcount.getAccountNumber());
        System.out.println(checkingAcount.getBalance());
    }

}
