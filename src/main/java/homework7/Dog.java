package homework7;

public class Dog extends Pet implements IAbility {
    @Override
    public void foul() {
        System.out.println("Ups, I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }
}
