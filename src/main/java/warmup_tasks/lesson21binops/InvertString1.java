package warmup_tasks.lesson21binops;

public class InvertString1 {
  // contains only [a-zA-Z]
  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  // 1.

  // 2. NO if. NO tern op.
  String invert(String origin) {
    char[] chars = origin.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(chars[i] ^ 0b100000);
    }
    return new String(chars);
  }

  static String toUpper(String origin) {
    char[] chars = origin.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(chars[i] & ~0b100000);
    }
    return new String(chars);
  }
  static String toLower(String origin) {
    char[] chars = origin.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(chars[i] & ~0b100000);
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    String str = toUpper("AbCd");
    System.out.println(str);
    String str2 = toLower("AbCd");
    System.out.println(str2);
  }
}
