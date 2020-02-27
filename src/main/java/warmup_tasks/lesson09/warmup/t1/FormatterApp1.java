package warmup_tasks.lesson09.warmup.t1;

public class FormatterApp1 {
  public static void main(String[] args) {
    Formatter0 fmt1 = new Formatter1();
    Formatter0 fmt2 = new Formatter2();
    Formatter0 fmt3 = new Formatter3();

    // task1
    print("Hello", fmt1); // hello
    print("Hello", fmt2); // HELLO
    print("Hello", fmt3); // ***********
                                // *  Hello  *
                                // ***********
  }

  private static void print(String value, Formatter0 fmt) {
    String formatted=fmt.formatLetter(value);
    System.out.println(formatted);

  }
}
