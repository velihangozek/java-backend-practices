package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int integerNumber = readValidInteger(scanner, "Please enter an integer : ");
            double decimalNumber = readValidDouble(scanner, "Please enter a decimal number : ");

            printCastToDouble(integerNumber);
            printCastToInteger(decimalNumber);
        }

    }

    private static int readValidInteger(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                scanner.nextLine(); // consume invalid line.
                System.out.println("Invalid input - Please enter a valid integer! =>");
            }
        }
    }

    private static double readValidDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException exception) {
                scanner.nextLine(); // consume invalid line.
                System.out.println("Invalid input - Please enter a valid decimal number! =>");
            }
        }
    }

    private static void printCastToDouble(int integer) {
        double value = integer;
        System.out.println("Integer = " + integer + " to Decimal number = " + value);
    }

    private static void printCastToInteger(double decimal) {
        int integer = (int) decimal;
        System.out.println("Decimal number = " + decimal + " to Integer = " + integer);
    }
}