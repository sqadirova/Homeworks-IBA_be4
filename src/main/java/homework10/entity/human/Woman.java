package homework10.entity.human;


import homework10.entity.pet.Pet;

import java.text.ParseException;

public final class Woman extends Human {

    public Woman(String name, String surname, String birthdate) throws ParseException {
        super(name, surname, birthdate);
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Hello my, %s\n", pet.getNickname());
    }

    public void makeup(){
        System.out.println("Lets begin makeup.");
    }
}
