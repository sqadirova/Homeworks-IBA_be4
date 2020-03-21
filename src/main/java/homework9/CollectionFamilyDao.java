package homework9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDAO {
   private List<Family> database=new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
       return database;
    }

    @Override
    public Optional<Family> getFamilyByIndex(int id) {
        return database.stream().filter(x -> x.getFamilyId() == id).findAny();
    }

    @Override
    public boolean deleteFamily(int id) {
        if (!(getFamilyByIndex(id).isPresent())) return false;
        int familyId = getFamilyByIndex(id).get().getFamilyId();
        database.remove(familyId);
        return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (!(getAllFamilies().contains(family))) return false;
        database.remove(family);
        return true;
    }

    @Override
    public void saveFamily(Family family) {
        database.add(family);
    }
}
