package homework9.Family;

import homework9.Human;
import homework9.Man;
import homework9.Pet;
import homework9.Woman;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {
    private int familyId;
    private Human mother;
    private Human father;
    private List<Human> children;
    private List<Pet> pet;
    private static int countOfChildren = 0;

    public Family() {
    }

    public Family(Human mother, Human father, List<Human> children, List<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public int getFamilyId() {
        return familyId;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getPet(), family.getPet());
    }

    public boolean addChild(Human child) { //, List<Human> children_list
        ArrayList<Human> temp = new ArrayList<>(getChildren());
        temp.add(child);
        countOfChildren++;
        setChildren(temp);
        return true;
    }

    public boolean deleteChild_Index(int index) {  //List<Human> childrenList,
        List<Human> temp = new ArrayList<>(getChildren());
        temp.remove(index);
        countOfChildren--;
        setChildren(temp);
        return true;
    }


    public boolean deleteChild_Obj(Human child) {  //List<Human> childrenList,
        List<Human> temp = new ArrayList<>(getChildren());
        temp.remove(child);
        countOfChildren--;
        setChildren(temp);
        return true;
    }

    public Human bornChild(String male,String female){
        Human h;
        int iq=(getFather().getIq()+getMother().getIq())/2;
        int random= (int) (Math.random()*2);
        if(random==0){
            h=new Woman(female,getFather().getSurname(),2020,iq);
        }
        else{
            h=new Man(male,getFather().getSurname(),2020,iq);
        }
        this.addChild(h);
        return h;
    }

    public void addPet(Pet pet){
        this.pet.add(pet);
    }

    public int countFamily() {
        return countOfChildren + 2;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() +
                ", children=" + children.toString() +
                ", pet=" + "{" + pet.toString() + "}" +
                '}';
    }
}
