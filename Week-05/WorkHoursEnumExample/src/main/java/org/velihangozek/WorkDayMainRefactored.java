package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkDayMainRefactored {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
//            System.out.print("Enter day number (1=Mon … 7=Sun): ");
//            int day = sc.nextInt();
//            System.out.println( WorkDayRefactored.fromInt(day).getHours() );
            System.out.print("Enter day name or number: ");
            String token = sc.next();
            WorkDayRefactored wd = Character.isDigit(token.charAt(0))
                    ? WorkDayRefactored.fromInt(Integer.parseInt(token))
                    : WorkDayRefactored.fromString(token);
            System.out.println(wd.getHours());
        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid day with the name or number!");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
