package org.velihangozek;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RefactoredApproach {
    public static void main(String[] args) {
        System.out.println("Enter a word to count the letters: ");

        try (Scanner scanner = new Scanner(System.in)) {
            String clean = scanner.nextLine()
                    .toLowerCase()
                    .replaceAll("[^a-z]", "");

            Map<Character, Integer> letterCount = new LinkedHashMap<>();

            for (char c : clean.toCharArray()) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }

            letterCount.forEach((letter, freq) ->
                    System.out.println(letter + " = " + freq));

        }
    }
}
