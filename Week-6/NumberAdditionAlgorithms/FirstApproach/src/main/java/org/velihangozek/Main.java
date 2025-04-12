package org.velihangozek;

import java.util.*;
import java.io.*;

class Main {

    public static String numberAddition(String str) {
        int total = 0;
        int i = 0;

        while (i < str.length()) {
            // Check if the current character is a digit
            if (Character.isDigit(str.charAt(i))) {
                // Use a StringBuilder to accumulate all contiguous digits
                StringBuilder sb = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    sb.append(str.charAt(i));
                    i++;
                }
                // Parse the complete number and add it to total
                total += Integer.parseInt(sb.toString());
            } else {
                i++;  // Move to the next character if not a digit
            }
        }

        return Integer.toString(total);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(numberAddition(s.nextLine()));
        s.close();
    }
}

