package warmup_tasks.lesson20algo.warmup;

public class ShoesPairs {
  int calc(String origin) {

    int groups = 0;
    int shoes = 0;
    for (int i = 0; i < origin.length(); i++) {
      switch (origin.charAt(i)) {
        case 'L': shoes++; break;
        case 'R': shoes--; break;
      }
      if (shoes == 0) groups++;
    }
    return groups;
  }
}
