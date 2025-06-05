package org.velihangozek;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be non-negative.");
        }
        this.radius = radius;
    }

    public double getDiameter() {
        return (2 * radius);
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}