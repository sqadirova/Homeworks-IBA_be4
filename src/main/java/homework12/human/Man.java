package homework12.human;

import homework12.entity.Pet;
import homework12.entity.Human;


public final class Man extends Human {

    public Man(String name, String surname, String birthdate) {
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
