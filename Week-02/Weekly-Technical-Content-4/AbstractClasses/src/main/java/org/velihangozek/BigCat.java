package org.velihangozek;

public abstract class BigCat extends Cat{
    private int speed;

//    public BigCat(int speed) {
//        this.speed = speed;
//    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void makeSound() {
        System.out.println("ROARRR!!!");
    }
}
