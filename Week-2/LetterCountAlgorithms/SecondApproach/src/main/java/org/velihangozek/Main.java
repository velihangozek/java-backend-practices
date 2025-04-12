package org.velihangozek;

import java.util.*;
import java.io.*;

public class Main {
    public static String letterCount(String str) {
        String[] words = str.split(" ");
        String result = "-1";
        int maxRepeats = 0;

        for (String word : words) {
            int repeats = countRepeats(word);

            // Update if this word has more repeats
            if (repeats > maxRepeats) {
                maxRepeats = repeats;
                result = word;
            }
        }

        return (maxRepeats > 0) ? result : "-1";
    }

    // Helper method that calculates how many total repeated letters a word has
    private static int countRepeats(String word) {
        int[] freq = new int[256];  // could be 26 if only A–Z, but 256 handles ASCII
        for (char c : word.toCharArray()) {
            freq[c]++;
        }
        int repeats = 0;
        for (int count : freq) {
            if (count > 1) {
                repeats += (count - 1);
            }
        }
        return repeats;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(letterCount(s.nextLine()));
    }
}