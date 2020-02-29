package warmup_tasks.lesson11.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class task2 {

    public static void main(String[] args) {
//        List<Integer> randomNumbers = IntStream.generate(() -> (int) (Math.random() * 10 - 10))
//                .limit(20)
//                .boxed()
//                .collect(Collectors.toList());

        List<Integer> randoms = new Random().ints(20, -10, 10)
                .boxed().collect(Collectors.toList());

        List<String> collected1 = randoms.stream().filter(x -> x > 0)
                .map(x -> Math.sqrt(x))
                .map(d -> String.format("%3f", d))
                .collect(Collectors.toList());

        List<Integer> collected2 = randoms.stream()
                .filter(x -> x < 0)
                .collect(Collectors.toList());

        System.out.println(randoms);
        System.out.println(collected1);
        System.out.println(collected2);

    }
}
