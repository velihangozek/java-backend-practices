package org.velihangozek;

public class SecondOuter {

    private static String outerMessage = "outer message";

    private final class Nested {

        private static String innerMessage = "inner message";

        void innerDisplay() {
            System.out.println("Inner Non-Static Class - From SecondOuter");
        }
    }

    void secondOuterDisplay() {
        SecondOuter secondOuter = new SecondOuter();
        SecondOuter.Nested nested = secondOuter.new Nested();
        nested.innerDisplay();
        System.out.println("SecondOuter Class");
    }
}