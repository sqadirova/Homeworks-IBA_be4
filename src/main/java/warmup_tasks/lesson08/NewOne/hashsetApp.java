package warmup_tasks.lesson08.NewOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hashsetApp {
    public static void main(String[] args) {

        ArrayList<Integer> random_numList=new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            random_numList.add((int) (Math.random() * 20 - 10));
        }

        HashSet set=new HashSet<>();

        for (int i = 0; i < random_numList.size(); i++) {
            set.add(random_numList.get(i));
        }

        ArrayList<Integer> sorted=new ArrayList<>();
        sorted.addAll(set);
        Collections.sort(sorted);

        System.out.printf("Original List: %s\n",random_numList.toString());
        System.out.printf("Unique List: %s\n",set.toString());
        System.out.printf("Sorted List: %s\n",sorted.toString());






    }
}
