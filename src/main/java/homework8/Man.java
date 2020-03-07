package homework8;

public final class Man extends Human {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Hello dear, %s\n", pet.getNickname());
    }

    public void repairCar(){
        System.out.println("Lets begin repair my car.");
    }
}
