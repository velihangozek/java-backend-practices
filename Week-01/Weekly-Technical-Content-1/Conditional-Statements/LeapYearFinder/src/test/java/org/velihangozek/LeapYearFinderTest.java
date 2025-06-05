package org.velihangozek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LeapYearFinderTest {

    @Test
    void shouldReturnTrueForTypicalLeapYears() {
        assertTrue(new LeapYearFinder(2000).isLeapYear(), "2000 should be leap year (divisible by 400)");
        assertTrue(new LeapYearFinder(2024).isLeapYear(), "2024 divisible by 4 should be leap year");
        assertTrue(new LeapYearFinder(1600).isLeapYear(), "1600 is divisible by 400, thus leap year");
    }

    @Test
    void shouldReturnFalseForTypicalNonLeapYears() {
        assertFalse(new LeapYearFinder(1900).isLeapYear(), "1900 divisible by 100 but not 400, thus not leap year");
        assertFalse(new LeapYearFinder(2023).isLeapYear(), "2023 is not divisible by 4, not leap year");
        assertFalse(new LeapYearFinder(2100).isLeapYear(), "2100 is century but not divisible by 400, thus not leap year");
    }

    @Test
    void shouldHandleYear1900Correctly() {
        assertFalse(new LeapYearFinder(1900).isLeapYear(), "1900 divisible by 100 but not by 400, NOT a leap year");
    }

    @Test
    void shouldHandleYear2000Correctly() {
        assertTrue(new LeapYearFinder(2000).isLeapYear(), "2000 divisible by 400, should be leap year");
    }
}