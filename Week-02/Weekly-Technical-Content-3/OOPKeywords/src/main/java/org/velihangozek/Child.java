package org.velihangozek;

public class Child extends Parent {

    private String message = "Message from Child";

    public Child(String message) {
        // super(message);
        System.out.println(super.getMessage());
        System.out.println(this.getMessage());
    }

    /*
    @Override
    public String getMessage() {
        return message;
    }
     */

    // @Override
    public String getMessage1() {
        return message;
    }
}
