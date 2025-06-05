package org.velihangozek;

public class ChineseZodiacCalculator {
    private final int birthYear;

    public ChineseZodiacCalculator(int birthYear) {
        this.birthYear = birthYear;
    }

    public ChineseZodiacSign getZodiacSign() {
        return ChineseZodiacSign.fromYear(birthYear);
    }
}