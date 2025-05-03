package org.velihangozek;

public class BoundedGenericExample<T extends Animal> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}