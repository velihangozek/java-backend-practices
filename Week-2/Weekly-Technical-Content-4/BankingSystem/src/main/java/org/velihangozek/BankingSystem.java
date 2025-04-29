package org.velihangozek;

import java.util.Arrays;
import java.util.Scanner;

public class BankingSystem {
    private static final Customer[] customers = new Customer[10];

    public static void main(String[] args) {

        Customer defaultCustomer = new Customer("Velihan", "Gözek", "1q2w3e4r5t?_", "12345678901");
        customers[0] = defaultCustomer;

        menu();

    }

    private static void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHello " + customers[0].getFirstName() + "!\n");

        validatePassword(scanner);

        int choice;

        do {
            printMenu();

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    customers[0].listAccount();
                    break;
                case 3:
                    customers[0].listAccount();
                    System.out.print("Choose an account with the number: ");
                    int selectedAccount = scanner.nextInt();
                    BankAccount selectedBankAccount = customers[0].getBankAccounts()[selectedAccount - 1];

                    int transactionMenuChoice;

                    do {

                        System.out.println("Transcacting on the account ---> " + selectedBankAccount.getAccountNumber());
                        System.out.println("1 - Display Balance");
                        System.out.println("2 - Deposit");
                        System.out.println("3 - Withdraw");
                        System.out.println("4 - Display Currency Type of the Account");
                        System.out.println("0 - Back to the main menu");

                        transactionMenuChoice = scanner.nextInt();

                        switch (transactionMenuChoice) {
                            case 1:
                                double balance = selectedBankAccount.getBalance();
                                System.out.println("Balance = " + balance + " " + selectedBankAccount.getCurrency().getCurrencySymbol());
                                break;
                            case 2:
                                System.out.print("Enter the amount to deposit: ");
                                double depositAmount = scanner.nextDouble();
                                selectedBankAccount.deposit(depositAmount);
                                break;
                            case 3:
                                System.out.println("Enter the amount to withdraw: ");
                                double withdrawAmount = scanner.nextDouble();
                                selectedBankAccount.withdraw(withdrawAmount);
                                break;
                            case 4:
                                String currencyType = selectedBankAccount.getCurrency().name();
                                System.out.println("Currency Type of the account => " + currencyType);
                                break;
                            case 0:
                                System.out.println("Going back to the main menu...");
                                break;
                            default:
                                System.out.println("Invalid option selected. Valid options => 1, 2, 3, 4 or 0.");
                        }
                    } while (transactionMenuChoice != 0);
                    break;

                case 4:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option selected. Valid options are: 1, 2, 3, or 4.");
            }

        } while (choice != 4);
        System.out.println("Thank you for choosing our bank!");
    }

    private static void printMenu() {
        System.out.println("------------ Banking Transactions ------------");
        System.out.println("1 - Create a new account");
        System.out.println("2 - List existing accounts");
        System.out.println("3 - Select an account to transact on");
        System.out.println("4 - Exit");
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.println("Select a currency => 1 - TL, 2 - Dollar, 3 - Euro, 4 - Gold");
        int currencyChoice = scanner.nextInt();
//                    Currency[] currencies = Currency.values();
//                    Currency currency = currencies[currencyValue - 1];
        Currency currency = switch (currencyChoice) {
            case 1 -> Currency.TL;
            case 2 -> Currency.DOLLAR;
            case 3 -> Currency.EURO;
            case 4 -> Currency.GOLD;
            default -> {
                // throw new IllegalStateException("Unexpected value: " + currencyValue);
                System.out.println("Unexpected Currency! => Default is TL.");
                yield Currency.TL;
            }
        };

        String customerName = customers[0].getFirstName();
        String accountNumber = customerName.charAt(0) + "-" + customerName.length() + currencyChoice;

        BankAccount bankAccount = new BankAccount(accountNumber, balance, currency);

        // customers[0].getBankAccounts()[0] = bankAccount;
        customers[0].addAccount(bankAccount);
    }

    private static void validatePassword(Scanner scanner) {

        int wrongPasswordCounter = 0;

        String password;

        do {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (!customers[0].getPassword().equals(password)) {
                System.out.println("Your password didn't match! (" + (2 - wrongPasswordCounter) + " trials left!)");
                wrongPasswordCounter++;
            } else {
                System.out.println("Successfully logged in!");
                break;
            }

        } while (wrongPasswordCounter != 3);
    }
}
