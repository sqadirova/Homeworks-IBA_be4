package homework5;

import homework5.Pet;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
   private Pet pet;
   private Family family;
    //    Human mother;
//    Human father;

    private String[][] schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.getNickname());
    }

    public void describePet() {
        String pettricklevel;

        if (pet.getTrickLevel() > 50) pettricklevel = "very sly";
        else pettricklevel = "almost not sly";

        System.out.printf("I have a %s, he is %d years old," +
                " he is %s \n", pet.getSpecies(), pet.getAge(), pettricklevel);
    }

    //Human{name='Michael',
    // surname='Karleone',
    // year=1977,
    // iq=90,
    //schedule=[[day, task], [day_2, task_2]]

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", family=" + family +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public Human(String name, String surname, int year, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() &&
                getIq() == human.getIq() &&
                getName().equals(human.getName()) &&
                getSurname().equals(human.getSurname()) &&
                pet.equals(human.pet) &&
                Arrays.equals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getSurname(), getYear(), getIq(), pet);
        result = 31 * result + Arrays.hashCode(getSchedule());
        return result;
    }
}
