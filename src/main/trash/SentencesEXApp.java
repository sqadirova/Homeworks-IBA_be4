import warmup_tasks.lesson12.task3.Sentence;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class SentencesEXApp {
  public static void main(String[] args) throws IOException {
    Map<String, List<String>> sv = read("subj_verb.txt");
    Map<String, List<String>> vo = read("verb_obj.txt");
    List<Sentence> sentences = makeSentences(sv, vo);
    write(sentences, "sentences.txt");
  }

  private static List<Sentence> makeSentences(Map<String, List<String>> sv, Map<String, List<String>> vo) {
    List<Sentence> outcome = new ArrayList<>();
    for (String subj : sv.keySet()) {
      List<String> verbs = sv.get(subj);
      for (String verb : verbs) {
        List<String> objs = vo.get(verb);
        for (String obj : objs) {
          Sentence sent = new Sentence(subj, verb, obj);
          outcome.add(sent);
        }
      }
    }
    return outcome;
  }

  private static void write(List<Sentence> sentences, String filename) throws IOException {
    File ofile = new File(filename);
    BufferedWriter bw = new BufferedWriter(new FileWriter(ofile));
    for (Sentence line : sentences) {
      bw.write(line.represent());
      bw.write("\n");
    }
    bw.close();
  }

  private static Optional<Map<String, List<String>>> read(String filename) {
    try {
      File file = new File(filename);
      BufferedReader br = new BufferedReader(new FileReader(file));

      HashMap<String, List<String>> dict = new HashMap<>();
      Stream<String> lines = br.lines();
      //  splitted[0] splitted[1]
      // wrote: the book, the letter, the code
      lines.forEach(line -> {
        String[] splitted = line.split(":");
        String key = splitted[0].trim();
        String[] values_dirty = splitted[1].split(",");
        ArrayList<String> values = new ArrayList<>();
        for (String v : values_dirty) {
          values.add(v.trim());
        }
        dict.put(key, values);
      });
      return Optional.of(dict);
    } catch (FileNotFoundException ex) {
      System.out.println("File not found!");
       return Optional.empty();
    }

  }
}

