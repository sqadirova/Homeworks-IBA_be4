package homework8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamilyTest {

    @Test
    void addChild1() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Family family1 = new Family();
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        boolean expected = true;
        boolean actual = family1.addChild(child1);
        assertEquals(expected, actual);
    }

    @Test
    void addChild2() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        int expected = 3;
        int actual = family1.getChildren().size();
        assertEquals(expected, actual);
    }

    @Test
    void deleteChild_Index1() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        family1.deleteChild_Index(1);
        int expected = 2;
        int actual = family1.getChildren().size();
        assertEquals(expected, actual);
    }

    @Test
    void deleteChild_Index2() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        boolean expected = true;
        boolean actual = family1.deleteChild_Index(1);
        assertEquals(expected, actual);
    }

    @Test
    void deleteChild_Obj1() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        boolean expected = true;
        boolean actual = family1.deleteChild_Obj(child2);
        assertEquals(expected, actual);
    }

    @Test
    void deleteChild_Obj2() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Family family1 = new Family();
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        family1.deleteChild_Obj(child2);
        int expected = 2;
        int actual = family1.getChildren().size();
        assertEquals(expected, actual);
    }

    @Test
    void countFamily() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        Human child3 = new Human("Ali", "Qadirov", 2001, 80);
        Human mother = new Human("Sevda", "Qadirova", 1967, 80);
        Human father = new Human("Seyran", "Qadirov", 1963, 80);
        Family family1 = new Family();
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        family1.setMother(mother);
        family1.setFather(father);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        int expected = 5;
        int actual = family1.countFamily();
        assertEquals(expected, actual);
    }

}