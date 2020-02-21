package homework5;

import java.util.Arrays;

public class hw_05 {
//    public static String[][] schedule() {
//        String[][] _schedule = new String[7][2];
//
//        _schedule[0][0] = "monday";
//        _schedule[0][1] = "do home work; do sport";
//        _schedule[1][0] = "tuesday";
//        _schedule[1][1] = "go to courses; watch a film";
//        _schedule[2][0] = "wednesday";
//        _schedule[2][1] = "do home work; do tests";
//        _schedule[3][0] = "thursday";
//        _schedule[3][1] = "go to courses; do sport";
//        _schedule[4][0] = "friday";
//        _schedule[4][1] = "do home work; meeting with friends";
//        _schedule[5][0] = "saturday";
//        _schedule[5][1] = "go to courses";
//        _schedule[6][0] = "sunday";
//        _schedule[6][1] = "do home work; do sport";
//
//        return _schedule;
//    }

    public static void main(String[] args) {

        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Human child4 = new Human("Hasan", "Qadirov", 2001, 80);
        Human mother = new Human("Sevda", "Qadirova", 1967, 80);
        Human father = new Human("Seyran", "Qadirov", 1963, 80);

        String[] habits = {"eat", "DRINK", "sleep"};
        Pet pet1 = new Pet("cat", "mikky", 3, 70, habits);

        Family family1 = new Family();
        Human[] children = {child1, child2};
        // Human[] newchild=family1.addChild(children,child3);
        // family1.setChildren(newchild);
        family1.setMother(mother);
        family1.setFather(father);
        family1.setPet(pet1);
        family1.setChildren(family1.addChild(child3, children));

        System.out.printf("Count of family: %d\n", family1.countFamily());

        System.out.println("Before deleting child:");
        System.out.println(family1.toString());

        Boolean isDeleted = family1.isdeletedChild(children, 1);

        System.out.println("After deleting child:");
        System.out.println(family1.toString());




    }
}
