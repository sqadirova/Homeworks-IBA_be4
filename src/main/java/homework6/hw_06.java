package homework6;

public class hw_06 {
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
        Pet pet1 = new Pet(Species.cat, "mikky", 3, 70, habits);

        Family family1 = new Family();

        Human[] children = {child1};

        family1.setMother(mother);
        family1.setFather(father);
        family1.setPet(pet1);
        family1.setChildren(children);
        //add child
        family1.setChildren(family1.addChild(child2, family1.getChildren()));
        family1.setChildren(family1.addChild(child3, family1.getChildren()));
        family1.setChildren(family1.addChild(child4, family1.getChildren()));
        family1.setChildren(family1.addChild(child5, family1.getChildren()));


        //test toString() method
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(child4.toString());
        System.out.println(child5.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(pet1.toString());


        System.out.printf("Before deleting child: %s\n", family1.toString());

        //delete child obj
        family1.setChildren(family1.deleteChild_Obj(family1.getChildren(), child2));
        family1.setChildren(family1.deleteChild_Obj(family1.getChildren(), child5));

        System.out.printf("After 1st deleteing: %s\n", family1.toString());

        //delete child via index
        family1.setChildren(family1.deleteChild_Index(family1.getChildren(), 2));
        family1.setChildren(family1.deleteChild_Index(family1.getChildren(), 0));

        System.out.printf("After deleting child: %s\n", family1.toString());

        System.out.printf("Count of family: %d\n", family1.countFamily());   //????

    }
}
