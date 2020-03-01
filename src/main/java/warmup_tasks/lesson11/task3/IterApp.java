package warmup_tasks.lesson11.task3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterApp {
  public static void main(String[] args) {
    List<Integer> ints = Arrays.asList(1, 2, 3);

    // # 1
    for (int i = 0; i < ints.size(); i++) {
      System.out.println(i);
    }

    // # 2
    for (int i: ints) {
      System.out.println(i);
    }
    // # 3
    Iterator<Integer> it = ints.iterator();
    while (it.hasNext()) {
      int v = it.next();
      System.out.println(v);
    }

    for(Iterator<Integer> iti = ints.iterator();iti.hasNext();) {
      int v = iti.next();
      System.out.println(v);
    }

    for(Iterator<Integer> iti = ints.iterator();iti.hasNext();System.out.println(iti.next())) { }

    // # 4
    ints.forEach(x -> System.out.println(x));
    // # 5
    ints.stream().forEach(x -> System.out.println(x));
  }
}
