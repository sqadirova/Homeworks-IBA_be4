package homework6;

public class hw_06 {

    public static String[][] schedule() {
        String[][] _schedule = new String[7][2];

        _schedule[0][0] = DayOfWeek.monday.name();
        _schedule[0][1] = "do home work; do sport";
        _schedule[1][0] = DayOfWeek.tuesday.name();
        _schedule[1][1] = "go to courses; watch a film";
        _schedule[2][0] = DayOfWeek.wednesday.name();
        _schedule[2][1] = "do home work; do tests";
        _schedule[3][0] = DayOfWeek.thursday.name();
        _schedule[3][1] = "go to courses; do sport";
        _schedule[4][0] = DayOfWeek.friday.name();
        _schedule[4][1] = "do home work; meeting with friends";
        _schedule[5][0] = DayOfWeek.saturday.name();
        _schedule[5][1] = "go to courses";
        _schedule[6][0] = DayOfWeek.sunday.name();
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

        //add child //returm Human[]
//        family1.setChildren(family1.addChild(child2, family1.getChildren()));
//        family1.setChildren(family1.addChild(child3, family1.getChildren()));
//        family1.setChildren(family1.addChild(child4, family1.getChildren()));
//        family1.setChildren(family1.addChild(child5, family1.getChildren()));

        //add child
        family1.addChild(child2, family1.getChildren());
        family1.addChild(child3, family1.getChildren());
        family1.addChild(child4, family1.getChildren());
        family1.addChild(child5, family1.getChildren());


        System.out.printf("Before deleting child: %s\n", family1.toString());

        //delete child obj
//        family1.setChildren(family1.deleteChild_Obj(family1.getChildren(), child2));
//        family1.setChildren(family1.deleteChild_Obj(family1.getChildren(), child5));


        family1.deleteChild_Index(family1.getChildren(), 2);
        family1.deleteChild_Index(family1.getChildren(), 0);

        System.out.printf("After 1st deleteing: %s\n", family1.toString());

//        //delete child via index
//        family1.setChildren(family1.deleteChild_Index(family1.getChildren(), 2));
//        family1.setChildren(family1.deleteChild_Index(family1.getChildren(), 0));

        family1.deleteChild_Obj(family1.getChildren(), child5);
        family1.deleteChild_Obj(family1.getChildren(), child2);


        System.out.printf("After 2nd deleting child: %s\n", family1.toString());

        System.out.printf("Count of family: %d\n", family1.countFamily());   //????

    }
}
