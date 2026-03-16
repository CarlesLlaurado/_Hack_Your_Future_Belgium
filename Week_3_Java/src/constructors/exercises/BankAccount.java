package constructors.exercises;

/**
 TODO:
 1. Create class BankAccount with:
      - private fields accountNumber, balance
      - private static field accountCount
 2. Add constructors:
      - Default constructor → sets accountNumber="0000", balance=0
      - Parameterized constructor → sets accountNumber and balance
 3. Increment accountCount whenever a new account is created.
 4. Add methods deposit(), withdraw(), getBalance().
 5. Add static method getTotalAccounts().
 6. Test creating multiple accounts and check total accounts.
*/

public class BankAccount
{
    private String accountNumber;
    private int balance;
    private static int accountCount;

    public BankAccount() {
        this("0000", 0);
    }

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
    public int getBalance() {
        return balance;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("01234", 0);
        BankAccount account3 = new BankAccount("012345", 1250);

        System.out.println(account1.accountNumber + " = " + account1.getBalance());
        System.out.println(account2.accountNumber + " = " + account2.getBalance());
        System.out.println(account3.accountNumber + " = " + account3.getBalance());

        System.out.println("Account Count = " + BankAccount.accountCount);

        account2.deposit(1000);
        System.out.println(account2.getBalance());
        account2.withdraw(500);
        System.out.println(account2.balance);
    }
}
