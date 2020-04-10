package warmup_tasks.lesson31.web;

public class Calculator {
  public String doOperation(String x, String y, String op) {
    int p1 = Integer.parseInt(x);
    int p2 = Integer.parseInt(y);
    op= String.valueOf(p1+p2);
    return op;
  }
}
