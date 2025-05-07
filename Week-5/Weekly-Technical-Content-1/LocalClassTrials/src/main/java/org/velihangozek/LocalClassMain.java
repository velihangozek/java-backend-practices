package org.velihangozek;

public class LocalClassMain {
    public static void main(String[] args) {
        System.out.println("\n------------- LocalClassTest -------------\n");

        LocalClassTest localClassTest = new LocalClassTest();
        localClassTest.display();

        System.out.println("\n------------- SecondLocalClass -------------\n");

        SecondLocalClass secondLocalClass = new SecondLocalClass();
        secondLocalClass.calculate(2, 3);

        System.out.println("\n------------- ThirdLocalExample -------------\n");

        ThirdLocalExample thirdLocalExample = new ThirdLocalExample();
        thirdLocalExample.display();
    }
}
