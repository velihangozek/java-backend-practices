package org.velihangozek;

public class ThirdLocalExample {
    public void display() {
        final String greeting = "Hi, ";

        class ThirdLocal {
            public void thirdLocalDisplay() {
                System.out.println(greeting + "Velihan");
            }
        }

        ThirdLocal thirdLocal = new ThirdLocal();
        thirdLocal.thirdLocalDisplay();

    }
}
