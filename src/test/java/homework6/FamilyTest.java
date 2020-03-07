package homework6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    private Family family;

    @BeforeEach
    public void init(){
        this.family=new Family();
        Human[] children=new Human[5];
//        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
//        Human[] children = {child1};
        family.setMother(new Human("Sevda", "Qadirova", 1967, 80));
        family.setFather(new Human("Seyran", "Qadirov", 1963, 80));
        family.setPet(new Pet(Species.cat, "mikky", 3, 70, new String[]{"eat", "DRINK", "sleep"}));
        family.setChildren(children);
    }

    @Test
    void deleteChild_Obj_() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        family.addChild(child1, family.getChildren());

        assertEquals(true,family.deleteChild_Obj(family.getChildren(),child1));
    }

    @Test
    void deleteChild_Index() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);

        family.addChild(child1, family.getChildren());

        family.deleteChild_Index(family.getChildren(), 0);
        assertEquals(0, family.getchildrenCount());
    }


    @Test
    void addChild1() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);

        family.addChild(child1, family.getChildren());
        assertEquals(1, family.getchildrenCount());

        family.addChild(child2,family.getChildren());
        assertEquals(2,family.getchildrenCount());
    }

    @Test
    void addChild2() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);

        assertEquals(true, family.addChild(child1, family.getChildren()));
    }

    @Test
    void countFamily() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human child2 = new Human("Leyla", "Qadirova", 1993, 80);
        assertEquals(5,family.countFamily());

        family.addChild(child1, family.getChildren());
        family.addChild(child2, family.getChildren());

        assertEquals(7,family.countFamily());
    }

}