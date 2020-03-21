package homework9;

import java.util.List;

public class FamilyService {
    private FamilyDAO dao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public void displayAllFamilies() {
        dao.getAllFamilies().forEach(Family::toString);
    }

    public void getFamiliesBiggerThan(int count) {
        dao.getAllFamilies().stream().filter(x -> x.countFamily() > count).forEach(x -> x.toString());
    }

    public void getFamiliesLessThan(int count) {
        dao.getAllFamilies().stream().filter(x -> x.countFamily() < count).forEach(x -> x.toString());
    }

    public long countFamiliesWithMemberNumber(int count) {
        return dao.getAllFamilies().stream().filter(x -> x.countFamily() == count).count();
    }

    public void createNewFamily(Human mother,Human father) {
        Family newFamily = new Family(mother, father);
        dao.saveFamily(newFamily);
    }

    public boolean deleteFamilyByIndex(int id){
       return dao.deleteFamily(id);
    }

    public void bornChild(Family family,String boyName,String girlName){

    }

}
