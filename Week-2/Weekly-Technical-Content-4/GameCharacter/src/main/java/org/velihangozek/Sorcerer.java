package org.velihangozek;

public class Sorcerer extends Character{

    public Sorcerer(String name) {
        super(name, 1000, 350);
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(name + " attacking with spells! Damage => " + attackPower);
    }

    public void castSpell() {
        System.out.println(name + " casting the fire-ball spell!");
    }
}
