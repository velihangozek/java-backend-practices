package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("\nValid Password Requirements: \n");
            System.out.println("1. At least 8 characters");
            System.out.println("2. Does NOT include any space");
            System.out.println("3. If the first character is a letter, it must be UPPERCASE");
            System.out.println("4. Last character must be a question mark (?)\n");

            System.out.println("Please enter a password: ");
            String password = scanner.nextLine();

            if (isPasswordValid(password)) {
                System.out.println(password + " is a Valid Password :)");
            } else {
                System.out.println(password + " is an Invalid Password :(");
            }
        }

    }

    private static boolean isPasswordValid(String password) {

        if (password.length() < 8 || password.contains(" ")) {
            return false;
        }

        char firstCharacter = password.charAt(0);
        if (Character.isLetter(firstCharacter) && !Character.isUpperCase(firstCharacter)) {
            return false;
        }

        if (password.charAt(password.length() - 1) != '?') {
            return false;
        }

        return true;
    }
}