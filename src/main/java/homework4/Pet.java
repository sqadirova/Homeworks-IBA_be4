package homework4;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }


    //dog{
    // nickname='Rock',
    // age=5,
    // trickLevel=75,
    // habits=[eat, drink, sleep]}

    @Override
    public String toString() {
        return species + "{" +
                " nickname='" + nickname + "'" +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

}
