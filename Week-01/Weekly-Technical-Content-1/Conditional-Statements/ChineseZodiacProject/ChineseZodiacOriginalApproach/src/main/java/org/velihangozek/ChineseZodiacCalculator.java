package org.velihangozek;

public class ChineseZodiacCalculator {
    private final int birthYear;

    public ChineseZodiacCalculator(int birthYear) {
        this.birthYear = birthYear;
    }

    public String findChineseZodiacSign() {
        String chineseZodiac = switch (birthYear % 12) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Rat";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> throw new IllegalStateException("Unexpected value: " + birthYear % 12);
        };
        return chineseZodiac;
    }
}