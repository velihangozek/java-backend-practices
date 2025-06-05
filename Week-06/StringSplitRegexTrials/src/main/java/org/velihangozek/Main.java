package org.velihangozek;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "This    is  a test.";
        String[] words = input.split("\\s");

        System.out.println(Arrays.toString(words));

        String secondInput = "This              is a test.";
        String[] wordsSplittedProperly = secondInput.split("\\s+");

        for (String word : wordsSplittedProperly) {
            System.out.println(word);
        }

        // System.out.println(Arrays.toString(wordsSplitProperly));
    }
}