package homework10.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDAO {
    List<Family> familyList = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return familyList.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (getFamilyByIndex(index) == null) return false;
        familyList.remove(index);
        return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (!(getAllFamilies().contains(family))) return false;
        familyList.remove(family);
        return true;
    }


    @Override
    public void saveFamily(Family family) {
        familyList.remove(family);
        familyList.add(family);
    }

    @Override
    public void addFamily(Family family) {
        familyList.add(family);
    }

}
