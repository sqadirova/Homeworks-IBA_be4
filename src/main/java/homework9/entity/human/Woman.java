package homework9.entity.human;

import homework9.entity.pet.Pet;

public final class Woman extends Human {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Hello my, %s\n", pet.getNickname());
    }

    public void makeup(){
        System.out.println("Lets begin makeup.");
    }
}
