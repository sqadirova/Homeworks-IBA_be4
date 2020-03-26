package homework13.dao;

import homework13.entity.family.Family;

import java.util.List;

public interface FamilyDAO {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    Family getFamilyByObj(Family family);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);

    void addFamily(Family family);

    void saveDataToFile();

    void loadData(List<Family> families);

    void readData();


}
