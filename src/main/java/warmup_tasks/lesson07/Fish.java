package warmup_tasks.lesson07;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hello, I'm fish,my name is :"+"\""+name.toUpperCase()+"\"";
    }
}
