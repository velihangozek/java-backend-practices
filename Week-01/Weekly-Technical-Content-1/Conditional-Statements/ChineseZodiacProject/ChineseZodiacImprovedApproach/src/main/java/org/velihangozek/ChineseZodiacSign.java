package org.velihangozek;

public enum ChineseZodiacSign {
    MONKEY, ROOSTER, DOG, PIG, RAT, OX, TIGER, RABBIT, DRAGON, SNAKE, HORSE, SHEEP;

    public static ChineseZodiacSign fromYear(int year) {
        return values()[year % 12];
    }

    @Override
    public String toString() {
        // Capitalize first letter and lowercase others
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }
}
