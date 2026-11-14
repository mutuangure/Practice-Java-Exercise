package Question1;

public class BankAccount {
    private double balance;

    public void deposit (double amount) {
        balance += amount;
        System.out.println("Successfully deposited : " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Successfully withdrew: " + amount);
    }

    public void checkBalance() {
        System.out.println("Your current balance is : " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
