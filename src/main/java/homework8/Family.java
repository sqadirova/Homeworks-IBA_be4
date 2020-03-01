package homework8;


import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;
    private static int count = 0;

    public Family() {
    }

    public Family(Human mother, Human father, List<Human> children, Set<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
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

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }


    public boolean addChild(Human child) { //, List<Human> children_list
        ArrayList<Human> temp = new ArrayList<>(getChildren());
        temp.add(child);
        count++;
        setChildren(temp);
        return true;
    }

    public boolean deleteChild_Index(int index) {  //List<Human> childrenList,
        List<Human> temp = new ArrayList<>(getChildren());
        temp.remove(index);
        count--;
        setChildren(temp);
        return true;
    }


    public boolean deleteChild_Obj(Human child) {  //List<Human> childrenList,
        List<Human> temp = new ArrayList<>(getChildren());
        temp.remove(child);
        count--;
        setChildren(temp);
        return true;
    }

    public int countFamily() {
        return getChildren().size() + 2;
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
