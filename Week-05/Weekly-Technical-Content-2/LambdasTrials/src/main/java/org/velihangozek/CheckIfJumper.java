package org.velihangozek;

public class CheckIfJumper implements CheckTrait{

    @Override
    public boolean test(Animal animal) {
        return animal.canJump();
    }
}
