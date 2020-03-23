package warmup_tasks.lesson22recurs;

import java.util.Arrays;
import java.util.Random;

public class TheSum {

  static int sum(int[] data, int n) {
    //data[n]+data[n-1]+data[n-2]..
    if (n == 0) {
      return data[n];
    } else {
      return data[n] + sum(data, n - 1);
    }
  }

  public static void main(String[] args) {
    int[] d = new Random().ints(1, 10)
            .limit(10).toArray();
    int sum = sum(d, d.length - 1);
    System.out.println(Arrays.toString(d));
    System.out.println(sum);
  }
}
