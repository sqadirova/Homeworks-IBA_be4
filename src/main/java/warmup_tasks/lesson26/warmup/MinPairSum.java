package warmup_tasks.lesson26.warmup;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinPairSum {

    static class Pair{
        final int index;
        final int sum;

        Pair(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        List<Integer> data = new Random().ints(10, 25)
                .limit(50).boxed().collect(Collectors.toList());

        Pair pair = IntStream.range(0, data.size() - 1).mapToObj(idx -> new Pair(idx, data.get(idx) + data.get(idx + 1)))
                .min((p1, p2) -> p1.sum - p2.sum).orElseThrow(() -> new RuntimeException("should't be empty"));

        System.out.printf("Index 1: %d\n", pair.index);
        System.out.printf("Index 2: %d\n", pair.index + 1);
        System.out.printf("Sum:%d\n", pair.sum);


    }
}
