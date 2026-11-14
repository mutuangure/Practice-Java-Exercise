package Question1;

import java.util.Scanner;

public class BankAccount_1
{
    private double balance;

    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        var account = new BankAccount_1();

        System.out.println("===WELCOME TO ABC BANK===");

        System.out.print("Deposit : " );
        double depositAmount = scanner.nextInt();

        account.deposit(depositAmount);

        System.out.print("Withdrawal : " );
        double withdrawalAmount = scanner.nextInt();

        account.withdraw(withdrawalAmount);

        account.checkBalance();

        scanner.close();
    }

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
