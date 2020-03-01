package warmup_tasks.lesson11.task3;

public class HiddenApp {
  public static void main(String[] args) {
    Hidden data = new Hidden();
    for (String one: data) {
      System.out.println(one);
    }

//    Iterator<String> it = data.iterator();
//    while (it.hasNext()) {
//      System.out.println(it.next());
//    }
  }
}
