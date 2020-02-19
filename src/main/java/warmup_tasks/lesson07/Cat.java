package warmup_tasks.lesson07;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Hello, I'm cat,my name is :"+"\""+name.toUpperCase()+"\"";
    }
}
