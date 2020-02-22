package warmup_tasks.lesson08.NewOne;

import java.util.ArrayList;

public class hashset_NameApp {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Siddiqa");
        namesList.add("Ali");
        namesList.add("Alfred");
        namesList.add("Alfred");
        namesList.add("Antonio");
        namesList.add("Ali");
        namesList.add("Arthur");

        ArrayList<String> randomNameList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int index= (int) (Math.random()*namesList.size());
            randomNameList.add(namesList.get(index));
        }
        System.out.println(randomNameList.toString());

    }
}
