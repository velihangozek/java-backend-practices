package org.velihangozek;

public record Bird (int numberOfEggs, String name){

    public Bird(int numberOfEggs, String name, String nickname) {
        this(numberOfEggs, name + " - " + nickname);

    }

}
