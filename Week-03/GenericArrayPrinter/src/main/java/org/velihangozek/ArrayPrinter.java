package org.velihangozek;

public final class ArrayPrinter {
    private ArrayPrinter() { /* no instances */ }

    /**
     * Prints each element of the given array (or varargs) on a single line,
     * separated by spaces.
     *
     * @param <T>      element type
     * @param elements the elements to print
     */
    @SafeVarargs
    public static <T> void printArray(T... elements) {
        if (elements == null) {
            System.out.println("null - no elements");
            return;
        }
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}