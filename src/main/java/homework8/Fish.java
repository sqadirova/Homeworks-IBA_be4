package homework8;

import java.util.HashSet;

public class Fish extends Pet {
    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    public Fish(String nickname, int age, int trickLevel, HashSet habits) {
        super(Species.fish, nickname, age, trickLevel, habits);
    }
}