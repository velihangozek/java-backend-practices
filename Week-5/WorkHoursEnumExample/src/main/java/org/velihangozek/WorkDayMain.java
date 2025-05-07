package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkDayMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a day number in a week to display the work hours: ");
            printWorkHours(scanner);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid type entered. Please enter a valid integer.");
        }
    }

    private static void printWorkHours(Scanner scanner) {
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println(WorkDay.MONDAY.getWorkHoursInfo());
                break;
            case 2:
                System.out.println(WorkDay.TUESDAY.getWorkHoursInfo());
                break;
            case 3:
                System.out.println(WorkDay.WEDNESDAY.getWorkHoursInfo());
                break;
            case 4:
                System.out.println(WorkDay.THURSDAY.getWorkHoursInfo());
                break;
            case 5:
                System.out.println(WorkDay.FRIDAY.getWorkHoursInfo());
                break;
            case 6:
                System.out.println(WorkDay.SATURDAY.getWorkHoursInfo());
                break;
            case 7:
                System.out.println(WorkDay.SUNDAY.getWorkHoursInfo());
                break;
            default:
                System.out.println("Invalid day of week. Choose a day between 1-7 (inclusive)");

        }
    }
}
