package org.velihangozek;

import java.util.*;
import java.io.*;

class Main {
    public static String RunLength(String str) {

        // If the string is null or empty, return an empty string
        if (str == null || str.isEmpty()) {
            return "";
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();

        // Initialize count to 1 and start with the first character
        int count = 1;
        char previous = str.charAt(0);

        // Iterate from the second character to the end
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);

            // If current character is the same as the previous, increase count
            if (current == previous) {
                count++;
            } else {
                // Otherwise, append the count and previous character to result
                sb.append(count).append(previous);

                // Reset count and update previous to current
                count = 1;
                previous = current;
            }
        }

        // Append the last counted sequence
        sb.append(count).append(previous);

        // Convert StringBuilder to string and return
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(RunLength(s.nextLine()));
    }
}