package warmup_tasks.AtHome.Tasks_IntStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class iterateApp {
    public static void main(String[] args) {
        //iterate first 20 even numbers from (0 to infin)
        List<Integer> evenNumbers = IntStream.iterate(0, i -> i + 2).limit(20).boxed().collect(Collectors.toList());
        System.out.println(evenNumbers);

    }
}
