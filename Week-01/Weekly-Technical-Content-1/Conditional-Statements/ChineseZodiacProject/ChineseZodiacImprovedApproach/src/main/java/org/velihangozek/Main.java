package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nPlease enter your birth year to find your chinese zodiac sign: ");

            int birthYear;
            while (true) {
                try {
                    birthYear = scanner.nextInt();
                    if (birthYear > 0) break;
                    else System.out.println("Birth year must be positive.");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input provided. Please enter a numerical year: ");
                    scanner.nextLine();
                }
            }

            ChineseZodiacCalculator calculator = new ChineseZodiacCalculator(birthYear);
            ChineseZodiacSign sign = calculator.getZodiacSign();

            System.out.println("Your Chinese Zodiac sign is: " + sign);
        }
    }
}