package org.velihangozek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /**
     * Simple holder for a pair of values.
     */
    public record Pair<T>(T first, T second) {}

    /**
     * Returns the two integers in the input list whose
     * absolute difference is the smallest.
     *
     * @param numbers a non-null list of at least two elements
     * @return a Pair of two closest numbers (in ascending order)
     * @throws IllegalArgumentException if numbers is null or has fewer than 2 elements
     */
    public static Pair<Integer> findClosestPair(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("At least two numbers are required");
        }

        // Work on a sorted copy so we don't disturb the original list
        List<Integer> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);

        int minDiff = Integer.MAX_VALUE;
        Pair<Integer> closest = null;

        for (int i = 1; i < sorted.size(); i++) {
            int prev = sorted.get(i - 1);
            int curr = sorted.get(i);
            int diff = curr - prev;

            if (diff < minDiff) {
                minDiff = diff;
                closest = new Pair<>(prev, curr);
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        // 1) Build the list (10 unique, positive integers)
        List<Integer> uniqueNumbers = new ArrayList<>();

        // int randomNumber = (int) (Math.random() * 100);

        uniqueNumbers.add(3);
        uniqueNumbers.add(37);
        uniqueNumbers.add(35);
        uniqueNumbers.add(19);
        uniqueNumbers.add(21);
        uniqueNumbers.add(90);
        uniqueNumbers.add(56);
        uniqueNumbers.add(13);
        uniqueNumbers.add(8);
        uniqueNumbers.add(25);

        // 2) Find and print the closest pair
        Pair<Integer> closestPair = findClosestPair(uniqueNumbers);
        int a = closestPair.first();
        int b = closestPair.second();

        System.out.printf(
                "Closest pair: (%d, %d) → difference = %d%n",
                a, b, b - a
        );
    }
}