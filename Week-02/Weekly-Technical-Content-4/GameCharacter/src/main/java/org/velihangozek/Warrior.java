package org.velihangozek;

public class Warrior extends Character{

    public Warrior(String name) {
        super(name, 1500, 250);
    }

    @Override
    public void attack() {
        // super.attack();
        System.out.println(name + " attacking with the sword! Damage => " + attackPower);
    }

    public void shieldBlock() {
        System.out.println(name + " blocked the attack with the shield!");
    }

}
