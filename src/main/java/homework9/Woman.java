package homework9;

public final class Woman extends Human {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Hello my, %s\n", pet.getNickname());
    }

    public void makeup(){
        System.out.println("Lets begin makeup.");
    }
}
