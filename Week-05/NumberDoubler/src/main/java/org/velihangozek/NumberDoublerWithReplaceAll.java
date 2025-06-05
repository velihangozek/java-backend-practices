package org.velihangozek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDoublerWithReplaceAll {
    public static void main(String[] args) {
        // Initialize a modifiable list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Replace each element with its double
        numbers.replaceAll(n -> n * 2);

        // Print the updated list
        numbers.forEach(System.out::println);
    }
}
