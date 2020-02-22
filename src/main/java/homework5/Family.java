package homework5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private static int count = 2;

    public Family() {
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
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
        count++;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
        count++;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
        count++;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        count++;
    }

    public Human[] addChild(Human child, Human[] children_list) {
        ArrayList<Human> temp = new ArrayList<>(Arrays.asList(children_list));
        temp.add(child);
        count++;
        return temp.toArray(children_list);
    }

    public boolean isdeleteChild(Human[] childrenList, int index) {
        ArrayList<Human> temp = new ArrayList<>(Arrays.asList(childrenList));
        temp.remove(index);
        count--;
        setChildren(temp.toArray(childrenList));
        return true;
    }

    public int countFamily() {
        return count;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() +
                ", children=" + Arrays.toString(children) +
                ", pet=" + "{" + pet.toString() + "}" +
                '}';
    }

}
