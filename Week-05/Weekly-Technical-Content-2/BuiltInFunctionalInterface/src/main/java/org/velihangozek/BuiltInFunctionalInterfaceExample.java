package org.velihangozek;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.*;

public class BuiltInFunctionalInterfaceExample {
    public static void main(String[] args) {

        // SUPPLIER

        Supplier<LocalDate> localDateSupplier = LocalDate::now; // Method Reference
        System.out.println(localDateSupplier.get());

        Supplier<LocalDate> lambdaSupplier = () -> LocalDate.now(); // Lambda
        System.out.println(lambdaSupplier.get());

        // CONSUMER

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("velo");

        var map = new HashMap<String, Integer>();

        BiConsumer<String, Integer> integerBiConsumer = map::put;
        integerBiConsumer.accept("velo", 27);
        integerBiConsumer.accept("burcu", 33);
        integerBiConsumer.accept("selen", 23);
        integerBiConsumer.accept("petek", 28);

        System.out.println(map);

        // PREDICATE

        Predicate<String> stringPredicate = String::isEmpty;
        System.out.println("Is the string empty? => " + stringPredicate.test(""));
        System.out.println("Is the string empty? => " + stringPredicate.test("2312"));

        BiPredicate<String, String> stringStringBiPredicate = String::startsWith;
        System.out.println("Does Velihan starts with V? => " + stringStringBiPredicate.test("Velihan", "V"));
        System.out.println("Does Velihan starts with x? => " + stringStringBiPredicate.test("Velihan", "x"));

        // FUNCTION

        Function<String, Integer> stringIntegerFunction = String::length;
        Function<String, Integer> lambdaFunction = x -> x.length();

        System.out.println("Velooo length => " + stringIntegerFunction.apply("Velooo"));
        System.out.println("Velooo length => " + lambdaFunction.apply("Velooo"));

        BiFunction<String, String, String> stringBiFunction = String::concat;
        System.out.println(stringBiFunction.apply("Velo", "Han"));
    }
}