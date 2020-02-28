package homework6;


import java.util.ArrayList;
import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private static int count = 0;

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

//    public boolean addChild(Human child,Human[] children_list) {   //int index
//        ArrayList<Human> temp = new ArrayList<>(Arrays.asList(children_list));
//        temp.add(child);
//        count++;
//
//        // return temp.toArray(children_list);
////        for (int i = index; i < getChildren().length+1; i++) {
////            children[index]=child;
////            setChildren(children);
////        }
////        count++;
//        return true;
//    }

    public boolean addChild(Human child, Human[] originChildren) { //,int index
        int n = originChildren.length;
        Human[] newChildren = new Human[n + 1];
        for (int i = 0; i < n; i++) {
            newChildren[i] = originChildren[i];
        }
        newChildren[n] = child;
        setChildren(newChildren);
        // count++;
        return true;
    }

//    public Human[] deleteChild_Index(Human[] childrenList, int index) {
//        ArrayList<Human> temp = new ArrayList<>(Arrays.asList(childrenList));
//        temp.remove(index);
//        count--;
//        return temp.toArray(childrenList);
//    }

    public boolean deleteChild_Index(Human[] originChildren, int index) {
        if (originChildren == null || index < 0 || index >= originChildren.length) {
            return false;
        }

        Human[] anotherChildren = new Human[originChildren.length - 1];

        for (int i = 0, j = 0; i < originChildren.length; i++) {
            if (i == index) {
                continue;
            }
            anotherChildren[j++] = originChildren[i];
        }
        setChildren(anotherChildren);
        //  count--;
        return true;
    }


    //    public Human[] deleteChild_Obj(Human[] childrenList, Human child) {
//        ArrayList<Human> temp = new ArrayList<>(Arrays.asList(childrenList));
//        temp.remove(child);
//       // count--;
//        return temp.toArray(childrenList);
//    }

    public boolean deleteChild_Obj(Human[] originChildren, Human child) {
        if (originChildren == null || child==null) {
            return false;
        }
        int n=originChildren.length;
        Human[] anotherChildren = new Human[n - 1];
        for (int i = 0,k=0; i < n; i++) {
            if (!child.equals(originChildren[i])){
            anotherChildren[k++]=originChildren[i];}
        }
       // anotherChildren[n-1]=child;
        setChildren(anotherChildren);

        return true;
    }

    public int countFamily() {
        return getChildren().length + 2;
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
