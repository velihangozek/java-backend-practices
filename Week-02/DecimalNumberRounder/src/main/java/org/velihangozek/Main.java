package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

           double decimalNumber = readValidDouble(scanner, "\nPlease enter a decimal number: ");

           System.out.println("Rounding up => " + roundUp(decimalNumber));
           System.out.println("Rounding down => " + roundDown(decimalNumber));
           System.out.println("Rounding to the closest integer => " + roundToClosestInteger(decimalNumber));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input => Please enter a valid decimal value!");
        }

    }

    private static double readValidDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid number => Please enter a decimal value!");
            scanner.nextLine();
        }

        return scanner.nextDouble();
    }

    private static double roundUp(double number) {
        return Math.ceil(number);
    }

    private static double roundDown(double number) {
        return Math.floor(number);
    }

    private static double roundToClosestInteger(double number) {
        return Math.round(number);
    }
}