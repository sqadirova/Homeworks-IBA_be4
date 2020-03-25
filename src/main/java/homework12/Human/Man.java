package homework12.Human;

import homework12.Pet.Pet;


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
