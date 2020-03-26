package homework9.entity.pet;


import java.util.Set;

public class DomesticCat extends Pet implements IAbility {

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    public DomesticCat(String nickname, int age, int trickLevel, Set habits) {
        super(nickname, age, trickLevel, habits);

    }



}
