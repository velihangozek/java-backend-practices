package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nPlease enter the Celsius value to be converted to Fahrenheit: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = CelsiusToFahrenheitCalculator.convertToFahrenheit(celsius);
            System.out.printf("From Celsius: %.2f to Fahrenheit: %.2f%n", celsius, fahrenheit);
        } catch (Exception exception) {
            System.out.println("Something went wrong: " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}