package projects.project2;

public class CheckingAcount extends BankAccount {
    private double overdraftLimit;

    public CheckingAcount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double limit) {
        this.overdraftLimit = limit;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdraw a correct amount of money");
        }
    }
}
