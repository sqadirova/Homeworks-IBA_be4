package homework8;

import java.util.Set;

public class RoboCat extends Pet {
    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    @Override
    public void eat() {
        System.out.println("Hello owner.Give me some oil =)");

    }

    public RoboCat(String nickname, int age, int trickLevel, Set habits) {
        super(nickname, age, trickLevel, habits);
    }

}
