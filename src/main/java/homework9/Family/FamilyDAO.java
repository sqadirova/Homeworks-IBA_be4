package homework9.Family;

import java.util.List;
import java.util.Optional;

public interface FamilyDAO {
    List<Family> getAllFamilies();

    Optional<Family> getFamilyByIndex(int index);  //return Family

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);



}
