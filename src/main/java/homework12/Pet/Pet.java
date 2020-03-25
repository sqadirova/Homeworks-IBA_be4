package homework12.Pet;

import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set habits;

    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, Set habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set getHabits() {
        return habits;
    }

    public void setHabits(Set habits) {
        this.habits = habits;
    }


    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    public String prettyFormat(){
        return getClass().getSimpleName() + "{" +
                " nickname='" + nickname + "'" +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits.toString() +
                '}';
    }


    //dog{
    // nickname='Rock',
    // age=5,
    // trickLevel=75,
    // habits=[eat, drink, sleep]}

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                " nickname='" + nickname + "'" +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits.toString() +
                '}';
    }

}
