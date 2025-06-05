package org.velihangozek;

public enum WorkDayRefactored {
    MONDAY("9:00 - 17:00"),
    TUESDAY("9:00 - 17:00"),
    WEDNESDAY("9:00 - 17:00"),
    THURSDAY("9:00 - 17:00"),
    FRIDAY("9:00 - 17:00"),
    SATURDAY("9:00 - 13:00"),
    SUNDAY("9:00 - 13:00");

    private final String hours;
    private static final WorkDayRefactored[] DAYS = values();

    WorkDayRefactored(String hours) {
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }

    public static WorkDayRefactored fromInt(int day) {
        if (day < 1 || day > DAYS.length) {
            throw new IllegalArgumentException("Day must be between 1–7");
        }
        return DAYS[day - 1];
    }

    public static WorkDayRefactored fromString(String name) {
        try {
            return WorkDayRefactored.valueOf(name.trim().toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Unknown day: " + name);
        }
    }

}