package org.velihangozek;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String originalHello = "Hello, Velihan!";
        System.out.println("First Hello: " + originalHello);

        String hello1 = "     H e l l o , V e l i h a n !    ";
        String trimmedHello1 = hello1.trim();
        System.out.println("Trimmed Hello: " + trimmedHello1);

        String upperHello = originalHello.toUpperCase();
        System.out.println("Original Hello: " + originalHello);
        System.out.println("UPPERCASE Hello: " + upperHello);

        // Locale Specific Uppercase Conversion - Deprecated since Java 19
        String localeExample = "iğdır"; // Deliberately mistyped.
        String upperLocaleExample = localeExample.toUpperCase(new Locale("tr", "TR"));
        System.out.println("UPPER locale example: " + upperLocaleExample);

        String lowerHello = originalHello.toLowerCase();
        System.out.println("Original Hello: " + originalHello);
        System.out.println("lowercase Hello: " + lowerHello);

        // Locale Specific Lowercase Conversion - Deprecated since Java 19
        String localeExample2 = "İSTANBUL";
        String lowerLocaleExample2 = localeExample2.toLowerCase(new Locale("tr","TR"));
        System.out.println("lower locale example: " + lowerLocaleExample2);

        // Locale Example - Provided Factory Methods - Recommended Now - This approach is recommended in Java 21 as it avoids using the deprecated constructor for Locale.
        // Locale turkishLocale = Locale.of("tr", "TR");
        // String upToDatelocaleExample = localeExample2.toLowerCase(turkishLocale);

        String upToDateLocaleExample = "İSTANBUL";
        String lowerUpToDateLocaleExample = upToDateLocaleExample.toLowerCase(Locale.of("tr", "TR")); // creates a Turkish locale using the new factory method.
        System.out.println("lower UpToDate Locale Example: " + lowerUpToDateLocaleExample);

        String containsExample = "Hi There!";
        boolean hasHi = containsExample.contains("Hi"); // true
        boolean hasthere = containsExample.contains("there"); // false - case sensitive
        boolean hasExclamation = containsExample.contains("!"); // true

        String lengthExample = "Aloha!";
        int length = lengthExample.length();
        System.out.println("length of " + lengthExample + ": " + length);

        String charAtExample = "Congratulations!";
        int index = 3;
        char specificChar = charAtExample.charAt(index);
        System.out.println("Specific char at index " + index + ": " + specificChar);

        String subStringExample = "Substring";
        int beginIndex = 3;
        String part1 = subStringExample.substring(beginIndex);
        int beginIndex2 = 5;
        int endIndex = 9;
        String part2 = subStringExample.substring(beginIndex2,endIndex);
        System.out.println("Begin index: " + beginIndex2 + " End index: " + endIndex + " Substring: " + part2 + " From String: " + subStringExample);
        System.out.println("Begin index only: " + beginIndex + " Substring: " + part1 + " From String: " + subStringExample);

        String greeting = "Hello " + "Velihan";
        System.out.println("Concatenated Greeting: " + greeting);

        int currentYear = 2025;
        String message = "The current year is -> " + currentYear;
        System.out.println("Concatenated String and int: " + message);

        String string1 = new String("Same"); // new String for demonstration
        String string2 = new String("Same"); // new String for demonstration
        System.out.println("Same object references? " + (string1 == string2)); // Parantheses are important here for precedence
        System.out.println("Same content? " + string1.equals(string2));

        String string3 = "Same"; // String Literal - From String Pool
        String string4 = "Same"; // String Literal - From String Pool
        System.out.println("Same object references? " + (string3 == string4)); // Same object from string pool
        System.out.println("Same content? " + string3.equals(string4));



    }
}