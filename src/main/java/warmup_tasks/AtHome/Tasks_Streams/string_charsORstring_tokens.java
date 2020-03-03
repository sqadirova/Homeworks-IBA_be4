package warmup_tasks.AtHome.Tasks_Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class string_charsORstring_tokens {
    public static void main(String[] args) {
        //1
        IntStream stream="12345_abscf".chars();
        stream.forEach(x -> System.out.println(x));   //ascii codes  49,50,51,52,53....

        //2
        Stream.of("A,B,C,D".split("\\,")).forEach(p-> System.out.println(p));
        //A
        //B
        //C
        //D

        //2.1 version
        Stream<String> streamString = Stream.of("A,B,C,D".split("\\,"));
        streamString.forEach(p-> System.out.println(p));
    }
}
