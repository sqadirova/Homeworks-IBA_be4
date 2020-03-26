package homework9.controller;

import homework9.entity.family.Family;
import homework9.entity.human.Human;
import homework9.entity.pet.Pet;
import homework9.service.FamilyService;

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

    public void deleteAllChildrenOlderThen(int year) {
        service.deleteAllChildrenOlderThen(year);
    }

    public int countOfFamilies() {
        return service.count();
    }

    public Family getFamilyById(int index) {
        return service.getFamilyById(index);
    }

    public List<Pet> getPets(int indexOfFamily) {
        return service.getPets(indexOfFamily);
    }

    public void addPet(int indexOfFamily, Pet pet) {
        service.addPet(indexOfFamily, pet);
    }


}
