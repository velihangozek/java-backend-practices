package org.velihangozek;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {
    public static void main(String[] args) {
        String name = null;
        // System.out.println(name.length()); => NullPointerException

        Book book = null;
        // System.out.println(book.getName()); => NullPointerException

        Optional<String> stringOptional = Optional.of("Velihan");
        System.out.println(stringOptional.get());

        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(name);
        System.out.println(optionalName.isPresent());
        System.out.println(stringOptional.isPresent());

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());

        Optional<String> stringOptional1 = Optional.ofNullable("Velihan");

        valueChecker(stringOptional1);
        valueChecker(emptyOptional);

        stringOptional1.ifPresent(name2 -> System.out.println("Value exists! => " + name2));
        System.out.println(Optional.ofNullable(name).orElse("Unknown Name"));


        System.out.println(Optional.ofNullable(name).orElseGet(() -> "Invalid Name"));

        // System.out.println(Optional.ofNullable(name).orElseThrow(() -> new IllegalArgumentException("Invalid User with the name")));

        List<String> names = List.of("Velihan", "Alina", "Berk" , "Asu");

        Optional<String> namesStartWithA = names.stream()
                .filter(name2 -> name2.startsWith("A"))
                .findAny();

        System.out.println(namesStartWithA.get());

        Optional<String> firstNameStartsWithA = names.stream()
                .filter(name2 -> name2.startsWith("A"))
                .findAny();

        System.out.println(firstNameStartsWithA.get());

        List<Integer> namesLengthList = names.stream()
                .map(String::length)
                .toList();

        namesLengthList.forEach(System.out::println);
    }

    private static void valueChecker(Optional<String> optionalString) {
        if (optionalString.isPresent()) {
            System.out.println("Value exists: " + optionalString.get());
        } else {
            System.out.println("No Value");
        }
    }
}