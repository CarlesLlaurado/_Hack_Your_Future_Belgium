package projects.project2;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interest) {
        interestRate = interest;
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        balance += (balance * interestRate / 100);
    }
}
