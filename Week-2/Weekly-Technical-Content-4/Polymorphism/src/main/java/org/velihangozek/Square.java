package org.velihangozek;

public class Square extends Shape{
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
