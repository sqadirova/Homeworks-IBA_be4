package homework12.entity.family;

import homework12.entity.human.Human;
import homework12.entity.pet.Pet;
import homework12.entity.human.Man;
import homework12.entity.human.Woman;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private List<Pet> pet = new ArrayList<>();


    private static int countOfChildren = 0;

//    public Family() {
//    }

    public Family(Human mother, Human father, List<Human> children, List<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        setMother(mother);
        setFather(father);
        mother.setFamily(this);
        father.setFamily(this);
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
        List<Human> listChildren = new ArrayList<>();
        for (Human human : this.children) {
            listChildren.add(human);
        }
        return listChildren;
    }

    public void setChildren(List<Human> children) {
        this.children = new ArrayList<Human>();
        for (Human human : children) {
            this.children.add(human);
        }
    }

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = new ArrayList<>(pet);
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

    public boolean addChild(Human child) {
        children.add(child);
        child.setFamily(this);
        countOfChildren++;
        return true;
    }

    public boolean deleteChild_Index(int index) {
        if (children.get(index) != null) {
            children.remove(index);
            countOfChildren--;
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteChild_Obj(Human child) {
        if (children.contains(child)) {
            children.remove(child);
            countOfChildren--;
            return true;
        } else {
            return false;
        }
    }

    public Human bornChild(String male, String female) {
        Human h;
        int iq = (getFather().getIq() + getMother().getIq()) / 2;
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            h = new Woman(female, getFather().getSurname(), "12/02/1997");
        } else {
            h = new Man(male, getFather().getSurname(), "12/02/1997");
        }
        children.add(h);
        return h;
    }

    public void addPet(Pet pet){
        getPet().add(pet);
    }

    public int countFamily() {
        return getChildren().size()+2;
    }

    @Override
    public String toString() {
        return prettyFormat();
    }

    public String prettyFormat(){
        StringBuilder family=new StringBuilder();
        family.append("Family:");
        family.append("\n\t\tmother: "+mother.toString());
        family.append("\n\t\tfather: "+father.toString());
        family.append("\n\t\tchildren:");
        for (Human child:getChildren()) {
            family.append("\n\t\t\t\t"+child.toString());
        }
        family.append("\n\t\tPets:  "+getPet().toString());
        family.append("\n");

        return family.toString();
    }
}
