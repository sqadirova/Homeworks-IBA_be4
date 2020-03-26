package homework12.service;

import homework12.dao.CollectionFamilyDao;
import homework12.entity.family.Family;
import homework12.dao.FamilyDAO;
import homework12.entity.human.Human;
import homework12.entity.pet.Pet;
import homework12.exception.PetOverFlowException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDAO dao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public void displayAllFamilies() {
        dao.getAllFamilies().forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return dao.getAllFamilies().stream().filter(x -> x.countFamily() > count).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int count) {
        return dao.getAllFamilies().stream().filter(x -> x.countFamily() < count).collect(Collectors.toList());
    }

    public long countFamiliesWithMemberNumber(int count) {
        return dao.getAllFamilies().stream().filter(x -> x.countFamily() == count).count();
    }

    public void createNewFamily(Human mother, Human father) {
        Family newFamily = new Family(mother, father);
        dao.addFamily(newFamily);
    }

    public boolean deleteFamilyByIndex(int index) {
        return dao.deleteFamily(index);
    }


    public Family bornChild(Family family, String boyName, String girlName) {
        family.bornChild(boyName, girlName);
        dao.saveFamily(family);
        return family;
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        dao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThen(int age) {
        dao.getAllFamilies().forEach(family -> {
            List<Human> newChildrenList = new CopyOnWriteArrayList<Human>();
            newChildrenList.addAll(family.getChildren().stream()
                    //.filter(child -> !(child.getBirthdate() > year))
                    .filter((child) -> ChronoUnit.YEARS.between(child.getAge(), LocalDate.now()) < age)
                    .collect(Collectors.toList()));
            family.setChildren(newChildrenList);
            dao.saveFamily(family);
        });
    }

    public int count() {
        return dao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return dao.getFamilyByIndex(index);
    }

    public Family getFamilyByObj(Family family) {
        return dao.getFamilyByObj(family);
    }

    public List<Pet> getPets(int indexOfFamily) {
        List<Pet> petList = new ArrayList<>(dao.getFamilyByIndex(indexOfFamily).getPet());
        return petList;
    }

    public void addPet(int indexOfFamily, Pet pet) {
        try {
            getFamilyById(indexOfFamily).getPet().add(pet);
            dao.saveFamily(getFamilyById(indexOfFamily));
        } catch (PetOverFlowException ex) {
            throw new PetOverFlowException("Pets count for one family is over f!");
        }
    }

}
