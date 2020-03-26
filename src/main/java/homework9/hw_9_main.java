package homework9;

import homework9.entity.Family;
import homework9.entity.Human;
import homework9.pet.Dog;
import homework9.entity.Pet;
import homework9.controller.FamilyController;

import java.util.HashSet;
import java.util.Set;

public class hw_9_main {
    public static void main(String[] args) {
        FamilyController familyController=new FamilyController();

        //family-1
        Human mother1 = new Human("Sevda", "Qadirova", 1967, 80);
        Human father1 = new Human("Seyran", "Qadirov", 1963, 80);
        Human daughter1 = new Human("Sidiqa", "Qadirova", 1997, 80);
        Human daughter1_2 = new Human("Irade", "Qadirova", 1998, 79);
        Human son1 = new Human("Ali", "Qadirov", 1994, 80);

//        //family-2
        Human mother2 =new Human("Arzu", "Aliyeva", 1970, 80);
        Human father2 = new Human("Hasan", "Aliyev", 1967, 80);
        Human daughter2 = new Human("Leyla", "Aliyeva", 1993, 80);
        Human son2 = new Human("Farid", "Aliyev", 1994, 80);

        //family-3
        Human mother3 = new Human("Sevinc", "Hesenova", 1975, 70);
        Human father3 = new Human("Hesen", "Hesenov", 1975, 82);
        Human son3 = new Human("Emin", "Hesenov", 1999, 80);


        familyController.createNewFamily(mother1,father1);
        familyController.createNewFamily(mother2,father2);
        familyController.createNewFamily(mother3,father3);

        System.out.printf("Count of all families: %d \n",familyController.countOfFamilies());

        System.out.println("All families as a list:");
        System.out.println(familyController.getAllFamilies());

        System.out.println("Display all families:");
        familyController.displayAllFamilies();


        Family f1 = familyController.getFamilyById(0);
        Family f2 = familyController.getFamilyById(1);
        Family f3 = familyController.getFamilyById(2);

        familyController.adoptChild(f1,son1);
        familyController.adoptChild(f1,daughter1);
        familyController.adoptChild(f1,daughter1_2);
        familyController.bornChild(f1,"Ilkin","Gul");
        System.out.println("Modified family-> f1:");
        System.out.println(f1);

        familyController.adoptChild(f2,son2);
        familyController.adoptChild(f2,daughter2);
        familyController.bornChild(f2,"Ferhad","Medine");
        System.out.println("Modified family-> f2:");
        System.out.println(f2);

        familyController.adoptChild(f3,son3);
        familyController.bornChild(f3,"Nazim","Aygun");
        System.out.println("Modified family-> f3:");
        System.out.println(f3);


        Set habits = new HashSet();
        habits.add("eat");
        habits.add("DRINK");
        habits.add("sleep");
        Pet dog1 = new Dog("Leo",1,50,habits);
        familyController.addPet(1, dog1);
        System.out.println(familyController.getPets(1));

        familyController.deleteFamilyByIndex(2);
        System.out.printf("Families after deleting family with index 0 and count of families: %d\n",familyController.countOfFamilies());
        familyController.displayAllFamilies();

        System.out.println("----------------------------------------------------------------");
        familyController.getFamiliesBiggerThan(5).forEach(System.out::println);

        familyController.getFamiliesLessThan(5).forEach(System.out::println);

        System.out.println(familyController.countFamiliesWithMemberNumber(5));

    }


}
