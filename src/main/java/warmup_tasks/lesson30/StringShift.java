package warmup_tasks.lesson30;

public class StringShift {
  public static String shift(String orig, int toLeft, int toRight) {
    String leftShift = shiftToLeft(orig, toLeft);
    String result = shiftToRight(leftShift, toRight);
    return result;
  }

  public static String shiftToLeft(String orig, int toLeft) {
    String shifted=orig.substring(toLeft)+orig.substring(0,toLeft);
    return shifted;
  }

  public static String shiftToRight(String orig, int toRight) {
    return shiftToLeft(orig,orig.length()-toRight);
  }

  public static void main(String[] args) {
    String shifted = shiftToLeft("string", 1); //trings
    System.out.println(shifted);

    System.out.println(shiftToRight("string", 1));  //gstrin

    System.out.println(shift("string",1,3)); //ngstri

  }
}
