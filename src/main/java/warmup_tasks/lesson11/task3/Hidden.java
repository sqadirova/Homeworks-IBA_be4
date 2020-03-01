package warmup_tasks.lesson11.task3;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hidden implements Iterable<String> {
  private final String[] months = {
          "Jan", "Feb", "Mar", "Apr", "May", "Jun",
          "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


  @Override
  public Iterator<String> iterator() {
    return new Iterator<String>() {
//     List<Integer> given= IntStream.rangeClosed(0,11).boxed()
//             .sorted((a,b)-> (b-a))
//             .collect(Collectors.toList());
List<Integer> given= IntStream.rangeClosed(0,11).boxed()
        .sorted((a,b)-> (int) (Math.random()*10-5))
        .collect(Collectors.toList());
      @Override
      public boolean hasNext() {
        return !given.isEmpty();
      }

      @Override
      public String next() {
       String month=months[given.get(0)];
       given.remove(0);
       return month;
      }
    };
  }



}
