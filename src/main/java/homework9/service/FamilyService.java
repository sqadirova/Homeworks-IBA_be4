package homework9.service;

import homework9.Family.CollectionFamilyDao;
import homework9.Family.Family;
import homework9.Family.FamilyDAO;
import homework9.Human.Human;
import homework9.Pet.Pet;

import java.util.ArrayList;
import java.util.List;
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

    public void deleteAllChildrenOlderThen(int year) {
        dao.getAllFamilies().stream().forEach(family -> {
            List<Human> newChildrenList = new ArrayList<>();
            newChildrenList.addAll(family.getChildren());

            newChildrenList.stream()
                    .filter(child -> !(child.getYear() > year))
                    .collect(Collectors.toList());
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

    public List<Pet> getPets(int indexOfFamily) {
        List<Pet> petList = new ArrayList<>(dao.getFamilyByIndex(indexOfFamily).getPet());
        return petList;
    }

    public void addPet(int indexOfFamily, Pet pet) {
        getFamilyById(indexOfFamily).getPet().add(pet);
        dao.saveFamily(getFamilyById(indexOfFamily));

    }


}
