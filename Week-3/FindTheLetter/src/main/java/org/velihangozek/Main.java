package org.velihangozek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FOUND_MARK = "found";
    private static final int ROUNDS = 4;

    public static void main(String[] args) {
        List<String> letters = new ArrayList<>(List.of("A", "Z", "F", "G"));

        try (Scanner scanner = new Scanner(System.in)) {

            // int initialSize = letters.size();
            for (int i = 1; i <= ROUNDS; i++) {
                System.out.print("Enter a valid UPPERCASE letter #" + i + ": ");
                String inputLetter = readLetter(scanner);
                processLetter(letters, inputLetter);
            }

            System.out.println("Updated List => " + letters);
        }

    }

    private static String readLetter(Scanner scanner) {
        String inputLetter;
        do {
            inputLetter = scanner.nextLine().strip().toUpperCase();
        } while (inputLetter.length() != 1 || !Character.isLetter(inputLetter.charAt(0)));
        return inputLetter;
    }

    private static void processLetter(List<String> letters, String letter) {
        if (letters.contains(letter)) {
            int indexOfLetter = letters.indexOf(letter);
            letters.set(indexOfLetter, FOUND_MARK);
        } else {
            letters.add(letter);
        }
    }
}