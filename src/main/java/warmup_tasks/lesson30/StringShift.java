package warmup_tasks.lesson30;

public class StringShift {
    public static String shift(String orig, int toLeft, int toRight) {
    //if ? toleft==toRight 2000000==200000
    //(toRight-toLeft)%leng

    String leftShift = shiftToLeft(orig, toLeft);
    String result = shiftToRight(leftShift, toRight);
    return result;
  }

//  public static String shift(String orig, int toLeft, int toRight) {
//    int len = orig.length();
//    int total = (toRight - toLeft) % len;
//    if (total == 0) return orig;
//
//    int middle = (total > 0) ? len - total : -total;
//    return orig.substring(middle)
//            .concat(orig.substring(0, middle));
//  }

  public static String shiftToLeft(String orig, int toLeft) {
    String shifted = orig.substring(toLeft) + orig.substring(0, toLeft);
    return shifted;
  }

  public static String shiftToRight(String orig, int toRight) {
    return shiftToLeft(orig, orig.length() - toRight);
  }

  public static void main(String[] args) {
    System.out.println(shiftToLeft("string", 1)); //trings

    System.out.println(shiftToRight("string", 1));  //gstrin

    System.out.println(shift("string", 1, 3)); //ngstri

  }
}
