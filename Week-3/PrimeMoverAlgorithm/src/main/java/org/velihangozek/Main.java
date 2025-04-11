package org.velihangozek;

import java.util.*;
import java.io.*;

public class Main {

        // Returns the nth prime number
        public static int primeMover(int num) {
            // We know the 10,000th prime is 104,729, so 200,000 is a safe upper bound
            int limit = 200_000;
            boolean[] isNotPrime = new boolean[limit + 1];

            // 0 and 1 are not prime by definition
            isNotPrime[0] = true;
            isNotPrime[1] = true;

            // Sieve of Eratosthenes to mark non-primes
            for (int i = 2; i * i <= limit; i++) {
                if (!isNotPrime[i]) {
                    for (int j = i * i; j <= limit; j += i) {
                        isNotPrime[j] = true;
                    }
                }
            }

            // Now iterate to find the nth prime
            int count = 0;
            for (int i = 2; i <= limit; i++) {
                if (!isNotPrime[i]) {
                    count++;
                    if (count == num) {
                        return i;
                    }
                }
            }

            // If for some reason we didn't find it (shouldn't happen with the chosen limit)
            return -1;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            // Read the input as an integer
            int input = Integer.parseInt(s.nextLine());

            // Print the nth prime number
            System.out.println(primeMover(input));
        }

}