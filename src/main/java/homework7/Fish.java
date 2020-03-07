package homework7;

public class Fish extends Pet {
    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }
}
