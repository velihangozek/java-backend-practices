package org.velihangozek;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /**
     * This method uses a regular expression to find all sequences of digits.
     * We then parse each matched sequence as an integer and add it to the total.
     *
     * @param str the input string possibly containing numbers
     * @return the sum of all the integer values found in the string
     */
    public static int numberAdditionRegex(String str) {
        // Compile a pattern that looks for one or more digits
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        int total = 0;
        while (matcher.find()) {
            // Each match is a sequence of digits
            String numberStr = matcher.group();
            total += Integer.parseInt(numberStr);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(numberAdditionRegex(s.nextLine()));
        s.close();
    }
}