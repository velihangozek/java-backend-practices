package org.velihangozek;

@FunctionalInterface
public interface Converter {
    double convert(double value);

    default void printConversion(double value) {
        System.out.println("Result: " + convert(value));
    }
}