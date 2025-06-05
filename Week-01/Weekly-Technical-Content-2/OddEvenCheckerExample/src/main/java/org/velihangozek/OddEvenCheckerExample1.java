package org.velihangozek;

import java.util.Scanner;

public class OddEvenCheckerExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer to be checked whether it is an even or an odd number: ");

        int number = scanner.nextInt();
        scanner.nextLine();

        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }

        // System.out.println("Enter test string: ");
        // scanner.nextLine(); --> the input will be an empty string without allowing the user to enter anything, if the scanner buffer wasn't discarded beforehand (after the nextInt() as it leaves the \n in the buffer.).

        scanner.close();
    }
}