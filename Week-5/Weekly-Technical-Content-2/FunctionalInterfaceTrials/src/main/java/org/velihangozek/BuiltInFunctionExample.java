package org.velihangozek;

import java.util.function.Function;

public class BuiltInFunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> length = str -> str.length();
        System.out.println("length of Velihan => " + length.apply("Velihan"));
    }
}