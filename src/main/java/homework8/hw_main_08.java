package homework8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hw_main_08 {
    public static String name(DayOfWeek day) {
        return day.toString();
    }

    public static HashMap<String,String> schedule() {
        HashMap<String,String> _schedule= new HashMap<>();

        _schedule.put(name(DayOfWeek.monday),"do home work; do sport");
        _schedule.put(name(DayOfWeek.tuesday),"go to courses; watch a film");
        _schedule.put(name(DayOfWeek.wednesday),"do home work; do tests");
        _schedule.put(name(DayOfWeek.thursday),"go to courses; do sport");
        _schedule.put(name(DayOfWeek.friday),"do home work; meeting with friends");
        _schedule.put(name(DayOfWeek.saturday),"go to courses");
        _schedule.put(name(DayOfWeek.sunday),"do home work; do sport");

        return _schedule;
    }

    public static void main(String[] args) {

        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80,schedule());
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80,schedule());
        Human child3 = new Human("Ali", "Qadirov", 2001, 80,schedule());
        Human child4 = new Human("Hasan", "Qadirov", 2001, 80,schedule());
        Human child5 = new Human("Arzu", "Qadirova", 2001, 80,schedule());
        Human mother = new Human("Sevda", "Qadirova", 1967, 80,schedule());
        Human father = new Human("Seyran", "Qadirov", 1963, 80,schedule());

        System.out.println(child1.toString());

        HashSet habits = new HashSet();
        habits.add("eat");
        habits.add("DRINK");
        habits.add("sleep");


        Pet pet1 = new Pet(Species.UNKNOWN, "mikky", 3, 70, habits) {
            @Override
            public void respond() {

            }
        };
        System.out.println(pet1.toString());

        ArrayList<Human> children=new ArrayList<Human>();
        children.add(child1);
        children.add(child2);

        Family family=new Family(mother,father,children,pet1);
        System.out.printf("Before adding child: %s\n",family.toString());
        family.addChild(child3,children);
        family.addChild(child4,children);
        System.out.printf("After adding child: %s\n",family.toString());



        DomesticCat dom_cat=new DomesticCat("kitty",1,70,habits);
        System.out.println(dom_cat);
        dom_cat.foul();
        dom_cat.respond();
        dom_cat.eat();


        Dog dog=new Dog("Rock",3,75,habits);
        System.out.println(dog);
        dog.foul();
        dog.respond();
        dog.eat();

        Fish fish=new Fish("Rikky",1,20,habits);
        System.out.println(fish);
        fish.respond();
        fish.eat();

        RoboCat roboCat=new RoboCat("RoboNikky",2,90,habits);
        System.out.println(roboCat);
        roboCat.respond();
        roboCat.eat();


    }
}
