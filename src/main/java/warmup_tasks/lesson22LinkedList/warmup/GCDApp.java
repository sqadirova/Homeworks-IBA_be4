package warmup_tasks.lesson22LinkedList.warmup;

public class GCDApp {
  int gcd(int a, int b) {
    if(b==0) return a;
    else return gcd(b,a%b);
  }
}
