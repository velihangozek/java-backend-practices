package org.velihangozek;

import java.util.Arrays;
import java.util.List;

/**
 * NumberDoublerWithStream
 * <p>
 * Takes a list of integers, doubles each one,
 * and prints the results to the console.
 * <p>
 * Uses Java 8+ Stream API and lambdas
 * for a more concise and readable approach
 * compared to traditional for-loops.
 */
public class NumberDoublerWithStream {
    public static void main(String[] args) {
        // 1. Create the list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 2. Stream, map each value to n*2, then print
        numbers.stream()
                .map(n -> n * 2)               // double each element
                .forEach(System.out::println); // method reference to print
    }
}