package homework9.service;

import homework9.entity.Family;
import homework9.entity.Human;
import homework9.pet.Dog;
import homework9.pet.DomesticCat;
import homework9.entity.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    private FamilyService service = new FamilyService();
    private Human mother1;
    private Human father1;
    private Human daughter1;
    private Human daughter1_2;
    private Human son1;

    private Human mother2;
    private Human father2;
    private Human daughter2;
    private Human son2;

    private Set habits;
    private Pet pet1;
    private Pet pet2;

    @BeforeEach
    void init() {
        mother1 = new Human("Sevda", "Qadirova", 1967, 80);
        father1 = new Human("Seyran", "Qadirov", 1963, 80);
        daughter1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        daughter1_2 = new Human("Irade", "Qadirova", 1998, 79);
        son1 = new Human("Ali", "Qadirov", 1994, 80);

        mother2 = new Human("Arzu", "Aliyeva", 1970, 80);
        father2 = new Human("Hasan", "Aliyev", 1967, 80);
        daughter2 = new Human("Leyla", "Aliyeva", 1993, 80);
        son2 = new Human("Farid", "Aliyev", 1994, 80);

        service.createNewFamily(mother1, father1);
        service.createNewFamily(mother2, father2);

        habits = new HashSet();
        habits.add("eat");
        habits.add("DRINK");
        habits.add("sleep");

        pet1 = new Dog("Leo", 1, 50, habits);
        pet2 = new DomesticCat("Matilda", 1, 50, habits);

    }

    @Test
    void getAllFamilies() {
        assertEquals(2, service.getAllFamilies().size());
    }

    @Test
    void createNewFamily() {
        mother1 = new Human("Sevda", "Qadirova", 1967, 80);
        father1 = new Human("Seyran", "Qadirov", 1963, 80);
        daughter1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        daughter1_2 = new Human("Irade", "Qadirova", 1998, 79);
        son1 = new Human("Ali", "Qadirov", 1994, 80);
        service.createNewFamily(mother1, father1);

        assertEquals(3, service.getAllFamilies().size());
    }

    @Test
    void deleteFamilyByIndex() {
        assertTrue(service.deleteFamilyByIndex(0));
    }

    @Test
    void bornChild() {
        Family f2 = service.getFamilyById(1);
        assertEquals(0, f2.getCountOfChildren());

        service.bornChild(f2, "Ilkin", "Gul");
        assertEquals(1, f2.getCountOfChildren() + 1);
    }

    @Test
    void adoptChild() {
        Family f2 = service.getFamilyById(1);
        service.adoptChild(f2, daughter1);
        service.adoptChild(f2, daughter1_2);
        assertEquals(2, f2.getCountOfChildren());
    }

    @Test
    void getFamilyById() {
        mother2 = new Human("Arzu", "Aliyeva", 1970, 80);
        father2 = new Human("Hasan", "Aliyev", 1967, 80);
        daughter2 = new Human("Leyla", "Aliyeva", 1993, 80);
        son2 = new Human("Farid", "Aliyev", 1994, 80);
        service.createNewFamily(mother2, father2);
        Family f3 = service.getFamilyById(2);

        assertEquals(f3, service.getFamilyById(2));
    }

    @Test
    void addPet() {
        Family family = service.getFamilyById(1);
        service.addPet(1, pet1);
        service.addPet(1, pet2);

        assertEquals(2, family.getPet().size());

    }

}