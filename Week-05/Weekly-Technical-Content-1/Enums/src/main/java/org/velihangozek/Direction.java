package org.velihangozek;

public enum Direction {
    NORTH(0, "North"),
    EAST(90, "East"),
    SOUTH(180, "South"),
    WEST(270, "West");

    private final int angle;
    private final String directionName;

    Direction(int angle, String directionName) {
        this.angle = angle;
        this.directionName = directionName;
    }

    public int getAngle() {
        return angle;
    }

    public String getDirectionName() {
        return directionName;
    }
}
