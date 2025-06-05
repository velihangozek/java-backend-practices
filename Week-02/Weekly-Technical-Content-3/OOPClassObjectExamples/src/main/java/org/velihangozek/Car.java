package org.velihangozek;

public class Car {

    // Fields
    private String brand;
    private String model;
    private int topSpeed;
    private int horsePower;
    private int maxGearCount = 6;
    private int gear = 0;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void move() {
        System.out.println("Moving forward!!!");
    }

    public void gearUp(int gearCount) {
        if (gearCount <= maxGearCount) {
            this.gear = gearCount;
            System.out.println("Current Gear => " + gear);
        } else {
            System.out.println("Max gear exceeded!");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
