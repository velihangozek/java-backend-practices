package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nPlease enter your height (in CM) and weight (in KG) to calculate your BMI (Body Mass Index): \n");

            double height = readPositiveDouble(scanner, "Height (CM): ");
            double weight = readPositiveDouble(scanner, "Weight (KG): ");

            BodyMassIndex bmiCalculator = new BodyMassIndex(height, weight);
            double bmi = bmiCalculator.getBodyMassIndex();

            System.out.printf("\nYour calculated BMI (Body Mass Index) is: %.3f%n", bmi);

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid Input. Please enter numerical values.");
        } catch (Exception exception) {
            System.out.println("An error occurred: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    /**
     * Reads a positive double value from the Scanner.
     *
     * @param scanner Scanner instance for input.
     * @param prompt  Prompt message for the user.
     * @return A positive double value.
     * @throws InputMismatchException if the input is not a double.
     */
    private static double readPositiveDouble(Scanner scanner, String prompt) {
        double value;
        do {
            System.out.println(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("That's not a valid number. Please try again.");
                scanner.nextLine();
                System.out.println(prompt);
            }
            value = scanner.nextDouble();
            if (value <= 0) {
                System.out.println("The value must be greater than zero. Please try again.");
            }
        } while (value <= 0);
        return value;
    }
}