package warmup_tasks.lesson24.warmup;

import java.util.Scanner;

public class IsPalindrome {
  boolean check(int n) {
    int r, temp;
    int sum = 0;

    temp = n;
    while (n > 0) {
      r = n % 10;
      sum = (sum * 10) + r;
      n = n / 10;
    }
    if (temp == sum)
      return true;
    else
      return false;
  }
}

