package homework7;

public final class Man extends Human {
    @Override
    public void greetPet() {
        System.out.printf("Hello dear, %s\n", getFamily().getPet().getNickname());
    }

    public void repairCar(){
        System.out.println("Lets begin repair my car.");
    }
}
