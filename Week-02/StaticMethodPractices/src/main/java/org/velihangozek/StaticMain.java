package org.velihangozek;

public class StaticMain {
    public static void main(String[] args) {

        Box box = new Box();
        box.name("Non-class (instance) reference: Velihan");

        Box.name("Class reference: Velihan");

        box.surname("Gözek");

        // Error -> Box.surname("Gözek");
    }
}
