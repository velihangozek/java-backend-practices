package org.velihangozek;

public record Point(int x, int y) {
    private static int z;

    public Point{
        if (x == y) {
            System.out.println("x and y value cannot be equal.");
        }
    }
}
