package warmup_tasks.lesson25.warmup;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CalculateApp {
    public static void calcNumOfRepetitions() {
        Map<Integer, Long> rep = new Random().ints(10, 25)
                .boxed()
                .limit(50)
//                .collect(Collectors.groupingBy(i -> i));  // -> Map<Integer, List<Integer>> rep
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));   //number= count  -> (count of repetitions)

        Map.Entry<Integer, Long> element = rep.entrySet().stream()
                .sorted((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
                .findFirst()   //min element occur (first elemnt)
                .orElseThrow(RuntimeException::new);


        System.out.println(rep);
        System.out.printf("Element %d, count %d\n", element.getKey(), element.getValue());
    }


    public static void main(String[] args) {
        calcNumOfRepetitions();
    }
}
