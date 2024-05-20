package eBanking;

import java.util.Scanner;

public class Transaction {
    double balance = 0;
    Scanner scanner = new Scanner(System.in);

    public void depositMoney() {
        System.out.println("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        System.out.println("Deposit " + amount + " to the bank successfully");
        double afterDeposit = balance + amount;
        System.out.println("Your current balance are: " + afterDeposit);
    }

    public void withdrawMoney() {
        System.out.println("Enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            System.out.println("Withdraw " + amount + " from the bank successfully");
            double afterWithdraw = balance - amount;
            System.out.println("Your current balance are: " + afterWithdraw);
        } else {
            System.out.println("Insufficient balance. Please try again");
        }
    }
}
