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
    private static int count=2;

//    {
//        count++;
//    }

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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family() {

    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }


    public Human[] addChild(Human[] obj,Human child) {
        ArrayList<Human> temp= new ArrayList<Human>(Arrays.asList(obj));
        temp.add(child);
        count++;
        return temp.toArray(new Human[0]);    //?
    }

    public boolean isdeletedChild(int index) {
        ArrayList<Human> children = new ArrayList<Human>(Arrays.asList(getChildren()));
        children.remove(index);
        count--;
        return true;
    }

    public int countFamily(){
       return count;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.getName()+" "+mother.getSurname()+
                ", father=" + father.getName()+" "+father.getSurname() +
                ", children=" + Arrays.toString(children) +
                ", pet=" +"{"+ pet.toString() +"}"+
                '}';
    }


}
