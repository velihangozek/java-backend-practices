package org.velihangozek;

public class Car extends Object {
    private String brand;
    private String model;
    public static int horsePower = 150;
    public static final int MAX_HORSE_POWER = 300; // CONSTANT

    public Car() {

    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
