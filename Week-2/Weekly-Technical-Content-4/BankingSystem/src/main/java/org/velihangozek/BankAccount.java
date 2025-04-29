package org.velihangozek;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private Currency currency;

    public BankAccount(String accountNumber, double balance, Currency currency) {
        if (balance < 0) System.out.println("Balance cannot be negative while creating an account!");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public void deposit(double amount) {
        if (amount <= 0) System.out.println("Invalid amount!");
        else {
            balance += amount;
            System.out.println("With the added amount: " + currency.getCurrencySymbol() + amount + ", New balance: " + balance + currency.getCurrencySymbol());
        }

    }
}
