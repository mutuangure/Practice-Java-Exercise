import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);

        var account = new BankAccount();

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
}