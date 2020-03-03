package warmup_tasks.AtHome.Tasks_Streams;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class filterApp {

    public static void main(String[] args) {
        //filter
        List<Integer> primes = IntStream.range(1, 100).filter(filterApp::isPrime).boxed().collect(Collectors.toList());
        System.out.println(primes);

    }

    //nonmatch
    public static  boolean isPrime(int i){
        IntPredicate isDivisible = index -> i % index == 0;
        return i>1 && IntStream.range(2,i).noneMatch(isDivisible);
    }
}
