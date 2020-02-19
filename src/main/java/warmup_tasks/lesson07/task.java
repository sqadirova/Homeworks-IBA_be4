package warmup_tasks.lesson07;

import java.util.ArrayList;

public class task {
    public static void main(String[] args) {

        Cat cat1=new Cat("Lucy");
        Dog dog1=new Dog("Zeus");
        Fish fish1=new Fish("Mikky");
        Animal dragon=new Animal("Dragonnn"){
            @Override
            public String toString() {
                return "Hello, I'm dragon,my name is :"+"\""+name.toUpperCase()+"\"";
            }
        };

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        animals.add(fish1);
        animals.add(dragon);
        System.out.println(animals.toString());
    }
}
