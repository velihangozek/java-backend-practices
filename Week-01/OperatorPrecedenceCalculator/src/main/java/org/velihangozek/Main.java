package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nPlease enter three numerical values to operate them arithmetically. ");
            System.out.print("\nEnter the first number: ");
            double firstOperand = readValidDouble(scanner);
            System.out.print("\nEnter the second number: ");
            double secondOperand = readValidDouble(scanner);
            System.out.print("\nEnter the third number: ");
            double thirdOperand = readValidDouble(scanner);

            OperatorPrecedenceCalculator calculator = new OperatorPrecedenceCalculator(firstOperand, secondOperand, thirdOperand);
            double result = calculator.operate();
            // System.out.println();
            // System.out.println("Result: " + firstOperand + " + " + secondOperand + " * " + thirdOperand + " - " + secondOperand + " = " + result);
            System.out.printf("\nResult: %.1f + %.1f * %.1f - %.1f = %.1f%n", firstOperand, secondOperand, thirdOperand, secondOperand, result);

        }
    }

    private static double readValidDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input provided. Please enter a numerical value: ");
                scanner.nextLine(); // Discarding the invalid input from the scanner's buffer.
            }
        }
    }
}