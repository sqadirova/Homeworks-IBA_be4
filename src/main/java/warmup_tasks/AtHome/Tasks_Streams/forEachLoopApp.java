package warmup_tasks.AtHome.Tasks_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class forEachLoopApp {
    public static void main(String[] args) {
        int[] array=new int[5];
        //1st way
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }

        System.out.println();

        //2nd way with IntStream
        List<Integer> arrayList = IntStream.iterate(0, i -> array[i] = i + 1).limit(array.length).boxed().collect(Collectors.toList());
        System.out.println(arrayList.toString());

        System.out.print("============================================\n");

        //3rd way with IntStream
        IntStream.iterate(0, i -> array[i] = i + 1).limit(array.length).forEach(System.out::println);

    }
}
