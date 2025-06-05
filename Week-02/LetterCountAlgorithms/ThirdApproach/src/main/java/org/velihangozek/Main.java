package org.velihangozek;

import java.util.*;

public class Main {
    public static String letterCount(String str) {
        String[] words = str.split(" ");
        String result = "-1";
        int maxRepeats = 0;

        for (String word : words) {
            // Count letter frequency for this word
            Map<Character, Integer> freq = new HashMap<>();
            for (char c : word.toCharArray()) {
                if (freq.containsKey(c)) {
                    freq.put(c, freq.get(c) + 1);
                } else {
                    freq.put(c, 1);
                }
            }

            // Calculate how many letters are repeated
            int repeats = 0;
            for (int count : freq.values()) {
                if (count > 1) {
                    // If a letter appears count times, (count - 1) are repeats
                    repeats += (count - 1);
                }
            }

            // Update the max if needed
            if (repeats > maxRepeats) {
                maxRepeats = repeats;
                result = word;
            }
        }

        // If no repeats found, return -1
        if (maxRepeats == 0) {
            return "-1";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(letterCount(s.nextLine()));
    }
}