package warmup_tasks.lesson09.warmup.t2;

public class FormatterApp2 {
  public static void main(String[] args) {
    Formatter0 fmt1 = new Formatter1();
    Formatter0 fmt2 = new Formatter2();
    Formatter0 fmt3 = new Formatter3();

    // task2
    fmt1.print("Hello");  // hello
    fmt2.print("Hello");  // HELLO
    fmt3.print("Hello");  // ***********
                          // *  Hello  *
                          // ***********
  }
}
