package homework9.Family;

import homework9.Human;
import homework9.Pet;

import java.util.List;

public class FamilyController {
    FamilyService service=new FamilyService();

//    public List<Family> getAllFamilies() {
//        return service.getAllFamilies();
//    }

    public void displayAllFamilies() {
        service.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int count){
        service.getFamiliesBiggerThan(count);
    }

    public void getFamiliesLessThan(int count){
        service.getFamiliesLessThan(count);
    }

    public long countFamiliesWithMemberNumber(int count){
        return service.countFamiliesWithMemberNumber(count);
    }

    public void createNewFamily(Human mother, Human father){
        service.createNewFamily(mother,father);
    }

    public boolean deleteFamilyByIndex(int index){
       return service.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family,String boyName,String girlName){
       return service.bornChild(family,boyName,girlName);
    }

    public Family adoptChild(Family family,Human child){
       return service.adoptChild(family,child);
    }

    public void deleteAllChildrenOlderThen(int year){
        service.deleteAllChildrenOlderThen(year);
    }

    public int countOfFamilies(){
        return service.count();
    }

    public Family getFamilyById(int index){
       return service.getFamilyById(index);
    }

    public List<Pet> getPets(int indexOfFamily){
        return service.getPets(indexOfFamily);
    }

    public void addPet(int indexOfFamily,Pet pet){
        service.addPet(indexOfFamily,pet);
    }



}
