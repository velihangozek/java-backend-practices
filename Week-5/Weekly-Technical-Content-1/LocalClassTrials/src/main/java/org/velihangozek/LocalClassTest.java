package org.velihangozek;

public class LocalClassTest {

    public void display() {

        class LocalDisplayClass{
            void localdisplay() {
                System.out.println("Local Class Display Method");
            }
        }

        System.out.println("Display Method");
        LocalDisplayClass localDisplayClass = new LocalDisplayClass();
        localDisplayClass.localdisplay();

    }

}
