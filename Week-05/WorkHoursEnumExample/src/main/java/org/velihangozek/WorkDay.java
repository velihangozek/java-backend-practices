package org.velihangozek;

public enum WorkDay {
    MONDAY("9:00 - 17:00"),
    TUESDAY("9:00 - 17:00"),
    WEDNESDAY("9:00 - 17:00"),
    THURSDAY("9:00 - 17:00"),
    FRIDAY("9:00 - 17:00"),
    SATURDAY("9:00 - 13:00"),
    SUNDAY("9:00 - 13:00");

    private String workHoursInfo;

    WorkDay(String workHoursInfo) {
        this.workHoursInfo = workHoursInfo;
    }

    public String getWorkHoursInfo() {
        return workHoursInfo;
    }
}
