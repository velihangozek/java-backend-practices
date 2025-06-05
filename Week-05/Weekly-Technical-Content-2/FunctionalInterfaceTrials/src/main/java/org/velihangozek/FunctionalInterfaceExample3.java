package org.velihangozek;

public class FunctionalInterfaceExample3 {
    public static void main(String[] args) {
        Converter celsiusToFahrenheit = celsius -> (celsius * 1.8) + 32;
        System.out.println("32 C to F: " + celsiusToFahrenheit.convert(32));
        System.out.println("14 C to F: " + celsiusToFahrenheit.convert(14));
        System.out.println("21 C to F: " + celsiusToFahrenheit.convert(21));

        celsiusToFahrenheit.printConversion(32);
        celsiusToFahrenheit.printConversion(14);
        celsiusToFahrenheit.printConversion(21);

    }
}