package org.velihangozek;

import java.util.Scanner;

public class Main {

    /**
     * This method scans the input string character by character.
     * Whenever it detects digits, it appends them to a StringBuilder.
     * When it reaches a non-digit, it finalizes the current number,
     * adds it to the total, and resets the StringBuilder.
     *
     * @param str the input string possibly containing numbers
     * @return the sum of all the integer values found in the string
     */
    public static int numberAddition(String str) {
        int total = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If it's a digit, accumulate it in currentNumber
                currentNumber.append(ch);
            } else {
                // If we hit a non-digit, parse the accumulated number if it exists
                if (!currentNumber.isEmpty()) {
                    total += Integer.parseInt(currentNumber.toString());
                    currentNumber.setLength(0);  // Reset StringBuilder
                }
            }
        }

        // Edge case: if the string ends with a digit, we still need to parse it
        if (!currentNumber.isEmpty()) {
            total += Integer.parseInt(currentNumber.toString());
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Read one line of input and print the sum of all numbers found in it
        System.out.print(numberAddition(s.nextLine()));
        s.close();
    }
}