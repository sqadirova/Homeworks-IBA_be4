package homework6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
//    private Family family;
//
//    @BeforeEach
//    public void init(){
//        this.family=new Family();
////        Human[] children=new Human[10];
//        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
//        Human[] children = {child1};
//        family.setMother(new Human("Sevda", "Qadirova", 1967, 80));
//        family.setFather(new Human("Seyran", "Qadirov", 1963, 80));
//        family.setPet(new Pet(Species.cat, "mikky", 3, 70, new String[]{"eat", "DRINK", "sleep"}));
//        family.setChildren(children);
//    }

    @Test
    void addChild1() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Family family1 = new Family();
        Human[] children = {child1};
        family1.setChildren(children);
        boolean expected=true;
        boolean actual=family1.addChild(child2, family1.getChildren());
        assertEquals(expected,actual);
    }

    @Test
    void addChild2() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Human child4 = new Human("Hasan", "Qadirov", 2001, 80);
        Family family1 = new Family();
        Human[] children = {child1};
        family1.setChildren(children);
        family1.addChild(child2, family1.getChildren());
        family1.addChild(child3, family1.getChildren());
        family1.addChild(child4, family1.getChildren());
        int expected=4;
        int actual=family1.getChildren().length;
        assertEquals(expected,actual);
    }


    @Test
    void deleteChild_Index1() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        Human[] children = {child1};
        family1.setChildren(children);
        family1.addChild(child2, family1.getChildren());
        family1.addChild(child3, family1.getChildren());
        boolean expected=true;
        boolean actual=family1.deleteChild_Index(family1.getChildren(), 1);
        assertEquals(expected,actual);
    }

    @Test
    void deleteChild_Index2() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        Human[] children = {child1};
        family1.setChildren(children);
        family1.addChild(child2, family1.getChildren());
        family1.addChild(child3, family1.getChildren());
        boolean expected=false;
        boolean actual=family1.deleteChild_Index(family1.getChildren(), family1.getChildren().length+1);
        assertEquals(expected,actual);
    }

    @Test
    void deleteChild_Obj1() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        Human[] children = {child1};
        family1.setChildren(children);
        family1.addChild(child2, family1.getChildren());
        family1.addChild(child3, family1.getChildren());
        boolean expected=true;
        boolean actual=family1.deleteChild_Obj(family1.getChildren(),child2);
        assertEquals(expected,actual);
    }

    @Test
    void countFamily() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        Human[] children = {child1};
        family1.setChildren(children);
        family1.addChild(child2, family1.getChildren());
        family1.addChild(child3, family1.getChildren());
        int expected=5;
        int actual=family1.countFamily();
        assertEquals(expected,actual);
    }

    @Test
    void testToString() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
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
        family1.addChild(child2, family1.getChildren());
        String expected="Family{mother=Sevda Qadirova, father=Seyran Qadirov," +
                " children=[Human{name='Sidiqa', surname='Qadirova', year=1997, iq=80}," +
                " Human{name='Leyla', surname='Qadirova', year=1993, iq=80}]," +
                " pet={cat{ nickname='mikky', age=3, trickLevel=70, habits=[eat, DRINK, sleep]}}}";
        String actual=family1.toString();
        assertEquals(expected,actual);
    }
}