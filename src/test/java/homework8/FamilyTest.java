package homework8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FamilyTest {
    private Family family;

    @BeforeEach
    public void init() {
        this.family = new Family();
        Map<String, String> schedule = new HashMap<String, String>() {{
            put(DayOfWeek.monday.name(), "go to sport");
        }};
        Human mother = new Woman("Sevda", "Qadirova", 1967);
        Human father = new Man("Seyran", "Qadirov", 1963);
        Pet dog = new Dog("Rock", 2, 70, new HashSet<>(Arrays.asList("eat", "sleep")));
        Pet fish = new Fish("Nemo", 1, 20, new HashSet<>(Arrays.asList("eat", "sleep")));
        family = new Family(mother, father, new ArrayList<>(), new HashSet<>(Arrays.asList(dog, fish)));
    }

    @Test
    void deleteChild_Obj_() {
       Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
       family.addChild(child1);
       assertTrue(family.deleteChild_Obj(child1));
    }

    @Test
    void deleteChild_Index() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        family.addChild(child1);
        assertTrue(family.deleteChild_Index(0));
    }

    @Test
    void addChild() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        assertTrue(family.addChild(child1));
    }

    @Test
    void addChild_TestCount() {
        Human child1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        family.addChild(child1);
        assertEquals(2,family.getCountOfChildren());
    }

}