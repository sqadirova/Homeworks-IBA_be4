package warmup_tasks.lesson07;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hello, I'm dog,my name is :"+"\""+name.toUpperCase()+"\"";
    }
}
