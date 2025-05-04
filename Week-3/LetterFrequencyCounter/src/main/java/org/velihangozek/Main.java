package org.velihangozek;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a word to count the letters: ");
        Scanner scanner = new Scanner(System.in);
        String cleanCaseInsensitiveWord = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        Map<Character, Integer> letterCount = new LinkedHashMap<>();

        int count = 1;

        char[] wordChar = cleanCaseInsensitiveWord.toCharArray();

        for (int i = 0; i < wordChar.length; i++) {
            for (int j = 0; j < wordChar.length; j++) {
                if (i != j && wordChar[i] == wordChar[j]) {
                    count++;
                }
            }
            letterCount.put(wordChar[i], count);
            count = 1;
        }

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println("Letter: " + entry.getKey() + " = " + entry.getValue() + " (Repetition)");
        }

    }
}