package homework13.dao;

import homework13.entity.family.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDAO {
    private List<Family> familyList = new ArrayList<>();
    private File file = new File("./src/main/java/homework13/file/family.bin");


    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return familyList.get(index);
    }

    @Override
    public Family getFamilyByObj(Family family) {
        int index = familyList.indexOf(family);
        return getFamilyByIndex(index);
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
    public void addFamily(Family family) {
        familyList.add(family);
    }

    @Override
    public void saveFamily(Family family) {
        familyList.remove(family);
        familyList.add(family);
    }
    @Override
    public void saveDataToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(familyList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException("IOException:", e);
        }
    }

    @Override
    public void readData() {
        try {
            List<Family> listLoaded = null;
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object readed = objectInputStream.readObject();
            listLoaded = (ArrayList<Family>) readed;
            objectInputStream.close();
            fileInputStream.close();
            listLoaded.forEach(this::saveFamily);
//            loadData(listLoaded);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
    }

    @Override
    public void loadData(List<Family> families) {
        familyList.addAll(families);
    }



}
