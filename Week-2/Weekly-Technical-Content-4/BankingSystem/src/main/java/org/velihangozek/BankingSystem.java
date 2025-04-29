package org.velihangozek;

import java.util.Scanner;

public class BankingSystem {
    private static Customer[] customers = new Customer[10];

    public static void main(String[] args) {

        Customer defaultCustomer = new Customer("Velihan", "Gözek", "1q2w3e4r5t?_", "12345678901");
        customers[0] = defaultCustomer;

        menu();

    }

    private static void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello " + customers[0].getFirstName() + '!');

        validatePassword(scanner);

        int choice;

        do {
            System.out.println("------------ Banking Transactions ------------");
            System.out.println("1 - Create a new account");
            System.out.println("2 - List existing accounts");
            System.out.println("3 - Select an account to transact on");
            System.out.println("4 - Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
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

                    customers[0].getBankAccounts()[0] = bankAccount;
            }

        } while (choice != 4);
        System.out.println("Thank you for choosing our bank!");
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
