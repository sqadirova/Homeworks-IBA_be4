package homework4;

import java.util.Arrays;
import java.util.Date;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet = new Pet();
//    Human mother;
//    Human father;
    String mother;
    String father;
    String[][] schedule;

    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.nickname);
    }

    public void describePet() {
        String pettricklevel;

        if (pet.trickLevel > 50) pettricklevel = "very sly";
        else pettricklevel = "almost not sly";

        System.out.printf("I have a %s, he is %d years old," +
                " he is %s \n", pet.species, pet.age, pettricklevel);
    }

    //Human{name='Michael',
    // surname='Karleone',
    // year=1977, iq=90,
    // mother=Jane Karleone,
    // father=Vito Karleone,
    // pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + "'" +
                ", surname='" + surname + "'" +
                ", year=" + year +
                ", iq=" + iq +
                ", mother='" + mother + "'" +
                ", father='" + father+ "'" +
                ", pet=" + pet.toString() +
                '}';
    }

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public Human(String name, String surname, int year, String mother, String father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, String mother, String father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }


}
