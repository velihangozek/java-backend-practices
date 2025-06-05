package org.velihangozek;

public class Box<C> {

    private C content;

    public C getContent() {
        return content;
    }

    public void setContent(C content) {
        this.content = content;
    }

}