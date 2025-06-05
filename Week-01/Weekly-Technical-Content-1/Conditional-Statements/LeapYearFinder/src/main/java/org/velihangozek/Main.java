package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int year = promptForYear(scanner);
            LeapYearFinder leapYearFinder = new LeapYearFinder(year);

            if (leapYearFinder.isLeapYear()) {
                System.out.println(year + " IS a Leap Year! :)");
            } else {
                System.out.println(year + " is NOT a Leap Year! :(");
            }
        }
    }

    // Input method extracted from main method for clarity.
    private static int promptForYear(Scanner scanner) {
        System.out.println("\nPlease enter a year to identify whether it is a leap year or not: ");

        while (true) {
            try {
                int year = scanner.nextInt();
                if (year > 0) {
                    return year;
                }
                System.out.println("Year must be positive. Try again: ");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input provided. Please enter a numerical value: ");
                // e.printStackTrace();
                scanner.nextLine();
            }
        }
    }
}