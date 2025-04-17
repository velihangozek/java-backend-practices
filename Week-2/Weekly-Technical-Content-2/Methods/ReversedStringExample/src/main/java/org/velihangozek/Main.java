package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // With Recursive

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String originalString = scanner.nextLine();

        String reversedString = reverse(originalString);
        System.out.println(reversedString);

    }

    // reverse(happy) -> reverse(reverse(appy) + h) -> reverse(reverse(reverse(ppy) + a) + h)  ->
    // reverse(reverse(reverse(reverse(py) p +) + a) + h) -> reverse(reverse(reverse(reverse(y) + p) + p) + a) + h) ->
    // reverse(reverse(reverse(reverse(reverse() + y) + p) + p) + a) + h) -> yppah

    private static String reverse(String originalString) {
        if (originalString.isEmpty()) return originalString;
        return reverse(originalString.substring(1)) + originalString.charAt(0);

    }
}