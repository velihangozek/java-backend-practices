package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your birth year to find your chinese zodiac sign: ");
            int birthYear = scanner.nextInt();
            ChineseZodiacCalculator chineseZodiacCalculator = new ChineseZodiacCalculator(birthYear);
            String chineseZodiac = chineseZodiacCalculator.findChineseZodiacSign();
            System.out.println("Your Chinese Zodiac sign is: " + chineseZodiac);
        }
    }
}