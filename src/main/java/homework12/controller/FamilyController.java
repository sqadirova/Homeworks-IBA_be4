package homework12.controller;

import homework12.entity.family.Family;
import homework12.entity.human.Human;
import homework12.entity.pet.Pet;
import homework12.exception.FamilyOverflowException;
import homework12.exception.PetOverFlowException;
import homework12.service.FamilyService;

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
        if (family.countFamily() > 7) {
            throw new FamilyOverflowException("Family size can't exceed 8");
        } else {
            return service.bornChild(family, boyName, girlName);
        }
    }

    public Family adoptChild(Family family, Human child) {
        if (family.countFamily() > 7) {
            throw new FamilyOverflowException("Family size can't exceed 8");
        } else {
            return service.adoptChild(family, child);
        }
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
        List<Pet> petList = getFamilyById(indexOfFamily).getPet();
        if (petList.size() > 5) {
            throw new PetOverFlowException("Pets count can't exceed 6");
        } else {
            service.addPet(indexOfFamily, pet);
        }
    }


}
