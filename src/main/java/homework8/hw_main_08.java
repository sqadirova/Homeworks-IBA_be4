package homework8;

import java.util.*;

public class hw_main_08 {
    public static String name(DayOfWeek day) {
        return day.toString();
    }

    public static Map<String, String> schedule() {
        Map<String, String> _schedule = new HashMap<>();

        _schedule.put(name(DayOfWeek.monday), "do home work; do sport");
        _schedule.put(name(DayOfWeek.tuesday), "go to courses; watch a film");
        _schedule.put(name(DayOfWeek.wednesday), "do home work; do tests");
        _schedule.put(name(DayOfWeek.thursday), "go to courses; do sport");
        _schedule.put(name(DayOfWeek.friday), "do home work; meeting with friends");
        _schedule.put(name(DayOfWeek.saturday), "go to courses");
        _schedule.put(name(DayOfWeek.sunday), "do home work; do sport");

        return _schedule;
    }

    public static void main(String[] args) {

        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Human child4 = new Human("Hasan", "Qadirov", 2001, 80);
        Human child5 = new Human("Arzu", "Qadirova", 2001, 80);
        Human mother = new Human("Sevda", "Qadirova", 1967, 80);
        Human father = new Human("Seyran", "Qadirov", 1963, 80);

        Set habits = new HashSet();
        habits.add("eat");
        habits.add("DRINK");
        habits.add("sleep");


        Pet pet1 = new Pet(Species.UNKNOWN, "mikky", 3, 70, habits) {
            @Override
            public void respond() {

            }
        };

        Pet pet2 = new Pet(Species.dog, "Rock", 2, 84, habits) {
            @Override
            public void respond() {

            }
        };
        System.out.println(pet1.toString());
        System.out.println(pet2.toString());

        Set<Pet> pets = new HashSet<>();
        pets.add(pet1);
        pets.add(pet2);

        List<Human> children = new ArrayList<>();

        Family family = new Family(mother, father, children, pets);
        System.out.printf("Before adding child: %s\n", family.toString());
        //add child
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.addChild(child5);
        System.out.printf("After adding child: %s\n", family.toString());

        //delete child by index
        family.deleteChild_Index(1);
        family.deleteChild_Index(0);
        System.out.printf("After delete child by index: %s\n", family.toString());

        //delete child by object
        family.deleteChild_Obj(child5);
        family.deleteChild_Obj(child4);
        System.out.printf("After delete child by object: %s\n", family.toString());

        //count of family
        System.out.printf("Count of family: %s\n", family.countFamily());

        System.out.println(family.toString());

    }
}
