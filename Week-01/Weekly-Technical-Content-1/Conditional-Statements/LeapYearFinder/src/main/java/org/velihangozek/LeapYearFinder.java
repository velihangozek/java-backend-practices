package org.velihangozek;

public class LeapYearFinder {
    private final int year;

    public LeapYearFinder(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}