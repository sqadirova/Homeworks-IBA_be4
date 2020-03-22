package warmup_tasks.lesson21binops;

public class InvertString {
  // contains only [a-zA-Z]
  // abc -> ABC
  // aBc -> AbC
  // Abc -> aBC
  // 1.

  // 2. NO if. NO tern op.
  String invert(String origin) {
    byte[] bytes = origin.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      bytes[i] ^= 0x20;
    }
    return new String(bytes);
  }
}
