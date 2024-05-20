package eBanking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating a new bank account...");
        System.out.println("====================================");
        System.out.println("Enter account's number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter account's holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter account's current balance: ");
        double balance = scanner.nextDouble();
        AccountBank account = new AccountBank();
        account.setAccountNumber(accountNumber);
        account.setAccountHolderName(accountHolderName);
        account.setBalance(balance);
        System.out.println("Account registered successfully!");
        System.out.println("====================================");
        account.displayAccountInfo();
        Transaction transaction = new Transaction();
        System.out.println("----------------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("----------------");
        System.out.println("Please enter your choice(1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                transaction.depositMoney();
                break;
            case 2:
                transaction.withdrawMoney();
                break;
            case 3:
                System.out.println("Not done yet");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
