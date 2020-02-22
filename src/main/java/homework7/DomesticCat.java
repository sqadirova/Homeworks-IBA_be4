package homework7;

public class DomesticCat extends Pet implements IAbility {

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am- %s. I miss you!\n", getNickname());
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.domesticCat,nickname, age, trickLevel, habits);

    }



}
