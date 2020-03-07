package homework7;

public class hw_main_07 {
    public static String name(DayOfWeek day) {
        return day.toString();
    }

    public static String[][] schedule() {
        String[][] _schedule = new String[7][2];

        _schedule[0][0] = name(DayOfWeek.monday);
        _schedule[0][1] = "do home work; do sport";
        _schedule[1][0] = name(DayOfWeek.tuesday);
        _schedule[1][1] = "go to courses; watch a film";
        _schedule[2][0] = name(DayOfWeek.wednesday);
        _schedule[2][1] = "do home work; do tests";
        _schedule[3][0] = name(DayOfWeek.thursday);
        _schedule[3][1] = "go to courses; do sport";
        _schedule[4][0] = name(DayOfWeek.friday);
        _schedule[4][1] = "do home work; meeting with friends";
        _schedule[5][0] = name(DayOfWeek.saturday);
        _schedule[5][1] = "go to courses";
        _schedule[6][0] = name(DayOfWeek.sunday);
        _schedule[6][1] = "do home work; do sport";

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

        String[] habits = {"eat", "DRINK", "sleep"};

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
