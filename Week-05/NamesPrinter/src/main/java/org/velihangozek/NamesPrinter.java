package org.velihangozek;

import java.util.List;

public class NamesPrinter {
    public static void main(String[] args) {

        // Create an immutable list of names
        List<String> names = List.of("Ahmet", "Ayşe", "Mehmet", "Zeynep");

        // Replace the traditional for-loop with a method reference
        names.forEach(System.out::println);

    }
}