package org.velihangozek;

public class CarTest {
    public static void main(String[] args) {

        Car bmw = new Car();

        Car bmw2 = new Car("BMW", "5.20");

        bmw.setBrand("BMW");
        bmw.setModel("M5");
        bmw.setTopSpeed(300);
        bmw.setHorsePower(450);

        bmw.move();
        bmw.gearUp(2);
    }
}
