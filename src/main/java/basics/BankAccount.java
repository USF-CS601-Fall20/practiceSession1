package basics;

/** Bank Account class - use as an example while writing other classes */
public class BankAccount {
    private double balance;
    private String owner;

    public BankAccount(double balance, String owner) {
        this.balance  = balance;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0)
            throw new IllegalArgumentException();
        balance -= amount;
    }

    public String toString() {
        return owner + ": " + balance;
    }
}
