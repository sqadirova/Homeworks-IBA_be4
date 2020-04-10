package warmup_tasks.lesson31.web;

public class Calculator {
  public String doOperation(String x, String y, String op) {
    int p1 = Integer.parseInt(x);
    int p2 = Integer.parseInt(y);
    if(op.equals("+")){return op=String.valueOf(p1+p2);}
    else if (op.equals("-")){return op= String.valueOf(p1-p2); }
    else if (op.equals("*")){return op= String.valueOf(p1*p2); }
    else if (op.equals("/")){return op= String.valueOf(p1/p2); }
    else return "Wrong operation";
  }
}
