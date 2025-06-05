package org.velihangozek;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());

        Car car2 = new Car("Mercedes", "SL63");
        System.out.println(car2.getBrand());
        System.out.println(car2.getModel());

        Car car3 = new Car("Volvo");
        System.out.println(car3.getBrand());
        System.out.println(car3.getModel());

        System.out.println("Super & This Keywords => ");
        Child child = new Child("message");

        int addResult = MathUtil.add(3, 9);

        MathUtil mathUtil = new MathUtil();
        int addResultFromStatic = mathUtil.add(2,4);

        System.out.println(addResultFromStatic);

        Car car4 = new Car();
        System.out.println("Static member via car4 instance reference => " + car4.horsePower);
        System.out.println("Static member via class reference => " + Car.horsePower);

        System.out.println("Changing static member value from 150 to 200...");
        Car.horsePower = 200;

        System.out.println("New static member value => ");
        System.out.println(Car.horsePower);

        System.out.println("Static member via car instance reference => " + car.horsePower);
        System.out.println("Static member via car2 instance reference => " + car2.horsePower);
        System.out.println("Static member via car3 instance reference => " + car3.horsePower);

        car2.horsePower = 110;

        System.out.println("Static member via car3 instance reference (After trying to change the value of static member via car2 instance) => " + car3.horsePower);

        System.out.println("Final => ");

        // Car.MAX_HORSE_POWER = 280; => Not Allowed - Final.

    }
}