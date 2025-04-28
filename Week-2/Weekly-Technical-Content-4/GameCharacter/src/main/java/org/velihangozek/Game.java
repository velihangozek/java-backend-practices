package org.velihangozek;

import java.net.Socket;

public class Game {
    /**
     * Warrior
     * Sorcerer
     * Archer
     */

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Riven");
        Sorcerer sorcerer = new Sorcerer("Ryze");
        Archer archer = new Archer("Legolas");

        System.out.println("\n---------- STATS ----------\n");

        warrior.showStats();
        sorcerer.showStats();
        archer.showStats();

        System.out.println("\n---------- ATTACKS STARTING ----------\n");

        warrior.attack();
        sorcerer.attack();
        archer.attack();

        System.out.println("\n---------- SPECIAL SKILLS ----------\n");

        warrior.shieldBlock();
        sorcerer.castSpell();
        archer.shootMultipleArrows();
    }
}
