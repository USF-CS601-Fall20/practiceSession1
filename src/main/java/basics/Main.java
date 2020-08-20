package basics;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0, "Smith");
        account.deposit(100);
        account.withdraw(10);
        System.out.println(account);
    }
}
