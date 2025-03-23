package org.velihangozek;

import java.util.Scanner;

public class OddEvenCheckerExample2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number limit to check the evenness/oddness of the numbers until the input number limit: ");

        Scanner scanner = new Scanner(System.in);

        int numberLimit = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <= numberLimit; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

        scanner.close();
    }
}
