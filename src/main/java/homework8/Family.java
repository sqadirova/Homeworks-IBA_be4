package homework8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Pet pet;
    private static int count = 2;

    public Family() {
    }

    public Family(Human mother, Human father, ArrayList<Human> children, Pet pet) {
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

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public boolean addChild(Human child, ArrayList<Human> children_list) {
        ArrayList<Human> temp = new ArrayList<>(children_list);
        temp.add(child);
        count++;
        setChildren(temp);
        return true;
    }

    public Human[] deleteChild_Index(Human[] childrenList, int index) {
        ArrayList<Human> temp = new ArrayList<>(Arrays.asList(childrenList));
        temp.remove(index);
        count--;
        return temp.toArray(childrenList);
    }


    public Human[] deleteChild_Obj(Human[] childrenList, Human child) {
        ArrayList<Human> temp = new ArrayList<>(Arrays.asList(childrenList));
        temp.remove(child);
        count--;
        return temp.toArray(childrenList);
    }

    public int countFamily() {
        return count;
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
