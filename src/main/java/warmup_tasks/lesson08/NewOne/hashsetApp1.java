package warmup_tasks.lesson08.NewOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hashsetApp1 {
    public static void main(String[] args) {

        List<Integer> ints = Stream.generate(() -> (int) (Math.random() * 20 - 10))
                .limit(30)
                .collect(Collectors.toList());

        HashSet<Integer> set = new HashSet<>(ints);

        ArrayList<Integer> sorted = new ArrayList<>();
        sorted.addAll(set);
        Collections.sort(sorted);

        System.out.printf("Original List: %s\n", ints.toString());
        System.out.printf("Unique List: %s\n", set.toString());
        System.out.printf("Sorted List: %s\n", sorted.toString());

    }
}
