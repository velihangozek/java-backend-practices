package org.velihangozek;

import static org.velihangozek.ArrayPrinter.printArray;

/**
 * Utility class for printing arrays or varargs of any type.
 */
public class GenericArrayPrinter {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Task"};

        printArray(intArray);
        printArray(strArray);
        printArray(1, 2, 3, 4, 5);
        printArray("Java", "Generics", "Task");
    }
}