package org.velihangozek;

public class BoundedGenericExample<T extends Animal> {
    // private static T staticContent; => static generic type not allowed.
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}