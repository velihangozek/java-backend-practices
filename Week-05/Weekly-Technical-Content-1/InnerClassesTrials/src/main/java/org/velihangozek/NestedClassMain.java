package org.velihangozek;

public class NestedClassMain {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Inner nested = new Outer.Inner();
        nested.innerDisplay();


        SecondOuter secondOuter = new SecondOuter();

        //  SecondOuter.Nested secondNested = secondOuter.new Nested(); => Nested has private access

        secondOuter.secondOuterDisplay();

    }
}
