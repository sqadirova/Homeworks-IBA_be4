package homework10.entity.human;

import homework10.entity.pet.Pet;

import java.text.ParseException;

public final class Man extends Human {

    public Man(String name, String surname, String birthdate) throws ParseException {
        super(name, surname, birthdate);
    }


    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Hello dear, %s\n", pet.getNickname());
    }

    public void repairCar(){
        System.out.println("Lets begin repair my car.");
    }
}
