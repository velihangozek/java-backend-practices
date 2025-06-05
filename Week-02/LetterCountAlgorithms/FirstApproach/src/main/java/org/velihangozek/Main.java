package org.velihangozek;

import java.util.*;
import java.io.*;

public class Main {
    public static String letterCount(String str) {

        // Split the string by spaces.
        String[] words = str.split(" ");

        int maxRepeats = 0;
        String result = "-1";

        for (String word : words) {
            // Remove punctuation and make it lowercase.
            String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Count frequencies of each letter.
            int[] frequencies = new int[26];
            for (char c : cleanWord.toCharArray()) {
                frequencies[c - 'a']++;
            }

            // Sum up all repeats (letters with the frequency > 1)
            int repeatSum = 0;
            for (int count : frequencies) {
                if (count > 1) {
                    repeatSum += count;
                }
            }

            // Keep track of the word with the largest total repeats
            if (repeatSum > maxRepeats) {
                maxRepeats = repeatSum;
                result = word.replaceAll("[^a-zA-Z]", "");
            }
        }

        return (maxRepeats > 0) ? result : "-1";
    }

    public static void main(String[] args) {
        // keep this function call here.
        Scanner s = new Scanner(System.in);
        System.out.print(letterCount(s.nextLine()));
    }
}