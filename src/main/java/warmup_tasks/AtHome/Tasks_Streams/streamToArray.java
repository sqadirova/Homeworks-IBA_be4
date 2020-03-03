package warmup_tasks.AtHome.Tasks_Streams;

import java.util.ArrayList;
import java.util.List;

public class streamToArray {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }

        Integer[] integerArray = list.stream().filter(x -> x % 2 == 0).toArray(value -> new Integer[value]);
        System.out.println(integerArray); //[Ljava.lang.Integer;@446445a
    }
}
