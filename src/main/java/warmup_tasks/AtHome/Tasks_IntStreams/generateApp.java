package warmup_tasks.AtHome.Tasks_IntStreams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class generateApp {
    public static void main(String[] args) {
        //version 1 with println
       IntStream.generate(()-> (int) (Math.random()*100)).limit(10).forEach(System.out::println);

        //version 2 with list.toString() => [1,2,3,///]
        List<Integer> listRandomNumbers = IntStream.generate(() -> (int) (Math.random() * 100))
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        System.out.print(listRandomNumbers.toString());

        //version 3
        int[] ints=new Random().ints(-100,100).limit(20).toArray();
        System.out.println(Arrays.toString(ints));

        //version4
        List<Integer> randomNums = new Random().ints(-100, 100).limit(10).boxed().collect(Collectors.toList());
        System.out.printf("random numbers: %s",randomNums.toString());


    }
}
