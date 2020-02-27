package homework8;

import java.util.HashSet;

public class Dog extends Pet implements IAbility {
    @Override
    public void foul() {
        System.out.println("Ups, I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    public Dog(String nickname, int age, int trickLevel, HashSet habits) {
        super(Species.dog, nickname, age, trickLevel, habits);
    }
}
