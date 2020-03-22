package homework9.Family;

import homework9.Human;
import homework9.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDAO dao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public void displayAllFamilies() {
        dao.getAllFamilies().forEach(Family::toString);
    }     //.map(x->x.toString())

    public void getFamiliesBiggerThan(int count) {
        dao.getAllFamilies().stream().filter(x -> x.countFamily() > count).forEach(x -> x.toString());  //.collect(Collectors.toList())
    }

    public void getFamiliesLessThan(int count) {
        dao.getAllFamilies().stream().filter(x -> x.countFamily() < count).forEach(x -> x.toString());
    }

    public long countFamiliesWithMemberNumber(int count) {
        return dao.getAllFamilies().stream().filter(x -> x.countFamily() == count).count();
    }

    public void createNewFamily(Human mother, Human father) {
        Family newFamily = new Family(mother, father);
        dao.saveFamily(newFamily);
    }

    public boolean deleteFamilyByIndex(int id){
       return dao.deleteFamily(id);
    }

    public Family bornChild(Family family,String boyName,String girlName){
        family.bornChild(boyName,girlName);
        dao.saveFamily(family);
        return family;
    }

    public Family adoptChild(Family family,Human child){
        family.addChild(child);
        dao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThen(int year){
       getAllFamilies().stream().forEach(family -> {
           List<Human> newChildrenList=family.getChildren().stream()
                   .filter(child->!(child.getYear()>year))
                   .collect(Collectors.toList());
           family.setChildren(newChildrenList);
           dao.saveFamily(family);
       });
    }

    public int count(){
        return dao.getAllFamilies().size();
    }

    public Family getFamilyById(int index){
        return dao.getFamilyByIndex(index).get();
    }

    public List<Pet> getPets(int indexOfFamily){
        List<Pet> petList=new ArrayList<>(getFamilyById(indexOfFamily).getPet());
        return petList;
    }

    public void addPet(int indexOfFamily,Pet pet){
        //1
       getFamilyById(indexOfFamily).getPet().add(pet);
        dao.saveFamily(getFamilyById(indexOfFamily));

        //version2
//        Family family = dao.getFamilyByIndex(indexOfFamily).get();
//        List<Pet> pets = family.getPet();
//        pets.add(pet);
//        family.setPet(pets);
//        dao.saveFamily(family);

    }
    
    
    
}
