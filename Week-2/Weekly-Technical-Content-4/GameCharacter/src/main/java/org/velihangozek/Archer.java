package org.velihangozek;

public class Archer extends Character{

    public Archer(String name) {
        super(name, 1200, 300);
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(name + " attacking with the arrows! Damage => " + attackPower);
    }

    public void shootMultipleArrows() {
        System.out.println(name + " shooting 3 arrows at once!");
    }
}
