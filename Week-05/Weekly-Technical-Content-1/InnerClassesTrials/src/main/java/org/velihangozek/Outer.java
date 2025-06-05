package org.velihangozek;

public class Outer {
    static class Inner {
        public void innerDisplay() {
            System.out.println("static inner class, public method");
        }

        private void privateInnerDisplay() {
            System.out.println("static inner class, private method");
        }
    }

    public void outerDisplay() {
        Outer.Inner inner = new Outer.Inner();
        System.out.println("outer class method");
        inner.innerDisplay();
        inner.privateInnerDisplay();
    }
}