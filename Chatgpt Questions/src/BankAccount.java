import java.util.Scanner;

public class BankAccount {
    private double balance;

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited : " + amount);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is : " + balance);
    }


}
