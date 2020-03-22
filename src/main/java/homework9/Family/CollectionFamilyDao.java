package homework9.Family;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        if(database.contains(family)){
            database.set(database.indexOf(family),family);
        }
        else{
            database.add(family);
        }
    }


//    public Human bornChild(Family family,String male, String female) {
//        Human h;
//        database.stream().map(x->x.bornChild(male,female)).
//        int iq=(family.getFather().getIq()+family.getMother().getIq())/2;
//        int random= (int) (Math.random()*2);
//        if(random==0){
//            h=new Woman(female,family.getFather().getSurname(),2020,iq);
//        }
//        else{
//            h=new Man(male,family.getFather().getSurname(),2020,iq);
//        }
//        family.addChild(h);
//        database.add(family);
//        return h;
//    }




}
