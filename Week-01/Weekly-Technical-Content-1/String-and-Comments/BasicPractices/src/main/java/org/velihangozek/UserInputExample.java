package org.velihangozek;

import java.util.Scanner;

public class UserInputExample {

    // static boolean bool;

    public static void main(String[] args) {

        // System.out.println(bool);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n----------- First Example ---------->\n");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome aboard, " + name + "! :)\n");

        System.out.print("Please enter your age as well: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years young!");


        System.out.println("\n----------- Not working as intended ---------->\n");

        // Did not work as intended. Because of the behavior of scanner.nextInt() method.
        // It does not consume the next line while scanner.nextLine() consumes (discards).
        // That's why the nextLine() method will capture an empty string here.
        System.out.print("Please enter your age first and then your name: ");
        int firstAge = scanner.nextInt();
        String secondName = scanner.nextLine();
        System.out.println("Entered age: " + firstAge + ", entered name: " + secondName);

        System.out.println("\n----------- Working as intended ---------->\n");

        // Works as intended.
        System.out.println("Please enter your name first and then your age: ");
        String firstName = scanner.nextLine();
        int secondAge = scanner.nextInt();
        System.out.println("Entered name: " + firstName + ", entered age: " + secondAge);

        System.out.println("\n----------- And another scanner.nextInt() example ---------->\n");

        System.out.println("Please enter your age and birth-year back to back: ");
        int currentAge = scanner.nextInt();
        int birthYear = scanner.nextInt();
        System.out.println("Entered current age: " + currentAge + ", entered birth-year: " + birthYear);

        scanner.close();

    }
}
