package org.velihangozek;

import java.nio.file.DirectoryStream;
import java.util.function.BiFunction;

public class LambdasExample4 {
    public static void main(String[] args) {

        // () -> true
        // (String x) -> x.startsWith("test");

        BiFunction<String, String, Boolean> stringStringBooleanBiFunction = (String x, String y) -> {
            return x.startsWith(y);
        };

        // Parentheses for parameters

    }
}
