package org.velihangozek;

public class Character {

    protected String name;
    protected int healthPoint;
    protected int attackPower;

    public Character(String name, int healthPoint, int attackPower) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " is attacking! Damage => " + attackPower);
    }

    public void showStats() {
        System.out.println("Character: " + name);
        System.out.println("HP (Health-Point): " + healthPoint);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("------------------------------------");
    }
}
