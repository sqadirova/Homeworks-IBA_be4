package homework13.controller;

import homework13.entity.family.Family;
import homework13.entity.human.Human;
import homework13.entity.pet.Pet;
import homework13.service.FamilyService;

import java.util.List;

public class FamilyController {
    FamilyService service = new FamilyService();

    public List<Family> getAllFamilies() {
        return service.getAllFamilies();
    }

    public void displayAllFamilies() {
        service.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return service.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan(int count) {
        return service.getFamiliesLessThan(count);
    }

    public int countFamiliesWithMemberNumber(int count) {
        return (int) service.countFamiliesWithMemberNumber(count);
    }

    public void createNewFamily(Human mother, Human father) {
        service.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        return service.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String boyName, String girlName) {
        return service.bornChild(family, boyName, girlName);
    }

    public Family adoptChild(Family family, Human child) {
        return service.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        service.deleteAllChildrenOlderThen(age);
    }

    public int countOfFamilies() {
        return service.count();
    }

    public Family getFamilyById(int index) {
        return service.getFamilyById(index);
    }

    public Family getFamilyByObj(Family family){return service.getFamilyByObj(family);}

    public List<Pet> getPets(int indexOfFamily) {
        return service.getPets(indexOfFamily);
    }

    public void addPet(int indexOfFamily, Pet pet) {
        service.addPet(indexOfFamily, pet);
    }

    public void loadDataFromFile(){
        service.loadDataFromFile();
    }

    public void saveDataToFile(){
        service.saveDataToFile();
    }

}
