package homework12.entity.human;

import homework12.converter.DataConverter;
import homework12.entity.pet.Pet;
import homework12.entity.family.Family;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private long birthdate;
    private int iq;
    private Family family;
    private Map<String, String> schedule;

    public Human() {
    }

    public Human(String name, String surname, String birthdate){  //, Map<String, String> schedule
        this.name = name;
        this.surname = surname;
        this.birthdate = DataConverter.stringToMillis(birthdate);
//        this.schedule = schedule;

    }

//    public Human(String name, String surname, String birthdate, int iq) { //, Map<String, String> schedule
//        this.name = name;
//        this.surname = surname;
//        this.birthdate = DataConverter.stringToMillis(birthdate);
//        this.iq = iq;
//        // this.schedule = schedule;
//    }


    public Human(String name, String surname, String birthdate, Family family) {
        this.name = name;
        this.surname = surname;
        this.birthdate = DataConverter.stringToMillis(birthdate);
        this.family = family;
    }

    //adoptedChild
    public Human(String name, String surname, String adoptChBD,int iq) {
        this.name = name;
        this.surname = surname;
        this.birthdate = DataConverter.stringToMillis(adoptChBD);
        this.iq = iq;
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

    public long getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(long birthdate) {
        this.birthdate = birthdate;
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

    public String prettyFormat(){
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + DataConverter.formatToString(birthdate) +
                ", iq=" + iq +
//                ", schedule=" + schedule.toString() +
                '}';
    }


    public LocalDate getAge(){
        LocalDate age= Instant.ofEpochMilli(birthdate).atZone(ZoneId.systemDefault()).toLocalDate();
        return age;

    }

    public String describeAge() {
        StringBuilder ageDescr = new StringBuilder();

        return ageDescr.append("Years: " + Period.between(getAge(), LocalDate.now()).getYears())
                .append(", month: " + Period.between(getAge(), LocalDate.now()).getMonths())
                .append(", days: " + Period.between(getAge(), LocalDate.now()).getDays())
                .toString();

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
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + DataConverter.formatToString(birthdate) +
                ", iq=" + iq +
//                ", schedule=" + schedule.toString() +
                '}';
    }

}
