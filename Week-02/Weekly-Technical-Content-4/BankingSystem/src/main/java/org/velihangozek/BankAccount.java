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

    public String getAccountNumber() {
        return accountNumber;
    }

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public void deposit(double amount) {
        if (amount <= 0) System.out.println("Invalid amount to deposit!");
        else {
            balance += amount;
            System.out.println("Amount deposited: " + amount + currency.getCurrencySymbol() + ", New balance: " + balance + currency.getCurrencySymbol());
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) System.out.println("Invalid amount to withdraw!");
        else if (amount > balance) System.out.println("Insufficient balance: " + balance + " - For the amount to withdraw: " + amount);
        else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount + currency.getCurrencySymbol() + ", New balance: " + balance + currency.getCurrencySymbol());
        }
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber = '" + accountNumber + '\'' +
                ", balance = " + balance +
                ", currency = " + currency +
                '}';
    }
}
