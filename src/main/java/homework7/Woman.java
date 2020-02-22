package homework7;

public final class Woman extends Human {
    @Override
    public void greetPet() {
        System.out.printf("Hello my, %s\n", getFamily().getPet().getNickname());
    }

    public void makeup(){
        System.out.println("Lets begin makeup.");
    }
}
