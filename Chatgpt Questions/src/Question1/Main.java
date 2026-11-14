package Question1;

import java.util.Scanner;

public class Main
{
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var account = new BankAccount();

        System.out.println("===WELCOME TO ABC BANK===");

        //Deposit section.
        while (true) {
            System.out.print("Deposit : ");
            double depositAmount = scanner.nextDouble();

            if (depositAmount > 0) {
                account.deposit(depositAmount);
                break;
            } else
                System.out.println("Invalid Amount! Please try again : ");
        }

        //Withdrawal section.
        while (true) {
            System.out.print("Withdrawal : ");
            double withdrawalAmount = scanner.nextDouble();

            if (withdrawalAmount > 0 && withdrawalAmount <= account.getBalance()) {
                account.withdraw(withdrawalAmount);
                break;
            } else if (withdrawalAmount <= 0) {
                System.out.println("Invalid withdraw amount! Try again... ");
            } else {
                System.out.println("Insufficient balance");
            }
        }
        account.checkBalance();

        scanner.close();

    }
}