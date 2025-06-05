package org.velihangozek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String password = "1q2w3e";

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean isWrongPassword = true;
        int count = 0;

        System.out.println("Please enter your password: ");

        while (isWrongPassword) {

            input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.println("Password is correct! You're logged in successfully.");
                isWrongPassword = false;
            } else if (count < 2) {
                System.out.println("Password is wrong! Please enter the correct password: ");
                count++;
            } else {
                System.out.println("You've entered the wrong password three times. You have been kicked from the system!!!");
                break;
            }
        }


    }
}