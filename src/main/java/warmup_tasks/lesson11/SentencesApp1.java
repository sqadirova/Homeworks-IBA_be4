package warmup_tasks.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SentencesApp1 {
  public static void main(String[] args) {
    List<String> subjects = list("Noel", "The cat", "The dog");
    List<String> verbs = list("wrote", "chased", "slept on");
    List<String> objects = list("the book", "the ball", "the bed");

    List<String> sentences = Stream.of(subjects, verbs, objects)
            .flatMap(Collection::stream)
            .collect(Collectors.toList());

    System.out.println(sentences.toString());

//    subjects.stream().flatMap(subj ->
//            verbs.stream().flatMap(verb ->
//                    objects.stream().map(obj ->
//                            all_possible(subj, verb, obj))))
//            .collect(Collectors.toList());

  }

  private static List<String> list(String value1, String value2, String value3) {
    ArrayList<String> lists = new ArrayList<>(Arrays.asList(value1, value2, value3));
    return lists;
  }


//  private static List<String> all_possible(List<String> subjects, List<String> verbs, List<String> objects) {
//    StringBuilder builder = new StringBuilder();
//    for (String s : subjects) {
//      for (String v : verbs) {
//        for (String o : objects) {
//          builder.append(s + " ");
//          builder.append(v + " ");
//          builder.append(o + "\n");
//        }
//      }
//    }
//    return Arrays.asList(builder.toString());
//
//  }
}
