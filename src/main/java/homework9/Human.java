package homework9;

import homework9.Family.Family;

import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private Map<String, String> schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public Human(String name, String surname, int year, int iq) { //, Map<String, String> schedule
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
       // this.schedule = schedule;
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

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    public void greetPet(Pet pet) {
        System.out.printf("Hello, %s\n", pet.getNickname());
    }

    public void describePet(Pet pet) {
        String petTricklevel;

        if (pet.getTrickLevel() > 50) petTricklevel = "very sly";
        else petTricklevel = "almost not sly";

        System.out.printf("I have a %s, he is %d years old," +
                " he is %s \n", pet.getSpecies(), pet.getAge(), petTricklevel);
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
//                ", schedule=" + schedule.toString() +
                '}';
    }

}
