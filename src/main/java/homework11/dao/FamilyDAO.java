package homework11.dao;

import homework11.entity.family.Family;

import java.util.List;

public interface FamilyDAO {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);

    void addFamily(Family family);


}
