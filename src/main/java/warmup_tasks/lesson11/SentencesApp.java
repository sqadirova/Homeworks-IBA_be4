package warmup_tasks.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentencesApp {
  public static void main(String[] args) {
    List<String> subjects = list("Noel", "The cat", "The dog");
    List<String> verbs = list("wrote", "chased", "slept on");
    List<String> objects = list("the book", "the ball", "the bed");

     all_possible(subjects, verbs, objects);


  }

  private static List<String> list(String value1, String value2, String value3) {
    ArrayList<String> lists = new ArrayList<>(Arrays.asList(value1, value2, value3));
    return lists;
  }


  private static void all_possible(List<String> subjects, List<String> verbs, List<String> objects) {
    StringBuilder builder = new StringBuilder();
    for (String s : subjects) {
      for (String v : verbs) {
        for (String o : objects) {
          builder.append(s + " ");
          builder.append(v + " ");
          builder.append(o + "\n");
        }
      }
    }
    System.out.println(builder);
  }

}
