package homework9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Family {
    private int familyId;
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;
    private static int countOfChildren = 0;

    public Family() {
    }

    public Family(Human mother, Human father, List<Human> children, Set<Pet> pet) {
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

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
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
