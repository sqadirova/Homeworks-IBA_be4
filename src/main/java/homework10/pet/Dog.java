package homework10.pet;


import homework10.entity.Pet;

import java.util.Set;

public class Dog extends Pet implements IAbility {

    @Override
    public void foul() {
        System.out.println("Ups, I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    public Dog(String nickname, int age, int trickLevel, Set habits) {
        super(nickname, age, trickLevel, habits);
    }


}
