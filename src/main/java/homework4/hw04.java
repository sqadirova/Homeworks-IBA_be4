package homework4;

import java.text.Format;
import java.util.Scanner;

public class hw04 {
    //method for initializing schedule array
    public static String[][] schedule() {
        String[][] _schedule = new String[7][2];

        _schedule[0][0] = "monday";
        _schedule[0][1] = "do home work; do sport";
        _schedule[1][0] = "tuesday";
        _schedule[1][1] = "go to courses; watch a film";
        _schedule[2][0] = "wednesday";
        _schedule[2][1] = "do home work; do tests";
        _schedule[3][0] = "thursday";
        _schedule[3][1] = "go to courses; do sport";
        _schedule[4][0] = "friday";
        _schedule[4][1] = "do home work; meeting with friends";
        _schedule[5][0] = "saturday";
        _schedule[5][1] = "go to courses";
        _schedule[6][0] = "sunday";
        _schedule[6][1] = "do home work; do sport";

        return _schedule;
    }

    public static Pet pet1Display(Pet pet) {
        pet.species = "dog";
        pet.nickname = "Rock";
        pet.age = 3;
        pet.trickLevel = 70;
        pet.habits = new String[]{"eat", "drink", "sleep"};
        return pet;
    }

    public static Pet pet2Display(Pet pet) {
        pet.species = "cat";
        pet.nickname = "Zeus";
        pet.age = 5;
        pet.trickLevel = 75;
        pet.habits = new String[]{"eat", "drink", "sleep"};
        return pet;
    }

    public static Human motherDisplay(Human human, Pet _pet) {

        //mother
        human.name = "Jane";
        human.surname = "Karleone";
        human.year = 1967;
        human.iq = 80;
        //human.schedule = schedule();
        human.mother= "Anna Austen";
        human.father= "Ray Austen";
        human.pet = _pet;
        return human;
    }

    public static Human fatherDisplay(Human human, Pet _pet) {

        //father
        human.name = "Vito";
        human.surname = "Karleone";
        human.year = 1963;
        human.iq = 80;
        //human.schedule = schedule();
        human.mother = "Janet Karleone";
        human.father = "Jack Karleone";
        human.pet = _pet;
        return human;
    }

    public static Human childDisplay(Human human, Human _mother, Human _father, Pet _pet) {
        //child
        human.name = "Rachel";
        human.surname = "Karleone";
        human.year = 1994;
        human.iq = 85;
       // human.schedule = schedule();
        human.mother = _mother.name;
        human.father = _father.name;
        human.pet = _pet;
        return human;
    }

    public static void main(String[] args) {
        Human mother = new Human();   //mother
        Human father = new Human();   //father
        Human child = new Human();   //child
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();

        Scanner in = new Scanner(System.in);

        pet1 = pet1Display(pet1);
        pet2 = pet2Display(pet2);    //child's pet
        mother = motherDisplay(mother, pet1);  //mother
        father = fatherDisplay(father, pet1);  //father
        child = childDisplay(child, mother, father, pet2);  //child



        System.out.println(child.toString());
        child.greetPet();
        child.describePet();

        System.out.println(pet2.toString());
        pet2.respond();
        pet2.eat();
        pet2.foul();



//        System.out.println(pet2.toString());
//
//        System.out.println(human1.toString());
//
//        System.out.println(human2.toString());



    }
}
