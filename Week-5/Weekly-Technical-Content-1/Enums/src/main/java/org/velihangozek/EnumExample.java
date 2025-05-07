package org.velihangozek;

public class EnumExample {
    public static void main(String[] args) {

        System.out.println("\n-------------- DAY --------------\n");

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        System.out.println("\n-------------- DIRECTION --------------\n");

        System.out.println("Name: " + Direction.NORTH.name() + " - " + "Ordinal: " + Direction.NORTH.ordinal() + " - " + "Angle: " + Direction.NORTH.getAngle() + " - " + "Direction Name: " + Direction.NORTH.getDirectionName());
        System.out.println("Name: " + Direction.EAST.name() + " - " + "Ordinal: " + Direction.EAST.ordinal() + " - " + "Angle: " + Direction.EAST.getAngle() +  " - " + "Direction Name: " + Direction.EAST.getDirectionName());
        System.out.println("Name: " + Direction.SOUTH.name() + " - " + "Ordinal: " + Direction.SOUTH.ordinal() + " - " + "Angle: " + Direction.SOUTH.getAngle() +  " - " + "Direction Name: " + Direction.SOUTH.getDirectionName());
        System.out.println("Name: " + Direction.WEST.name() + " - " + "Ordinal: " + Direction.WEST.ordinal() + " - " + "Angle: " + Direction.WEST.getAngle() +  " - " + "Direction Name: " + Direction.WEST.getDirectionName());

        System.out.println("\n-------------- OPERATION --------------\n");

        System.out.println(Operation.ADD.apply(2, 4));
        System.out.println(Operation.SUBTRACT.apply(2, 4));
        System.out.println(Operation.MULTIPLY.apply(2, 4));
        System.out.println(Operation.DIVIDE.apply(4, 2));
        System.out.println(Operation.DIVIDE.apply(2, 0));

    }
}
