package homework6;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }


    public Human(String name, String surname, int year, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    }

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
        System.out.printf("Hello, %s\n", family.getPet().getNickname());
    }

    public void describePet() {
        String petTrickLevel;

        if (family.getPet().getTrickLevel() > 50) petTrickLevel = "very sly";
        else petTrickLevel = "almost not sly";

        System.out.printf("I have a %s, he is %d years old," +
                " he is %s \n", family.getPet().getSpecies(), family.getPet().getAge(), petTrickLevel);
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
//                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

}
