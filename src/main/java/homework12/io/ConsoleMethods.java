package homework12.io;

public interface ConsoleMethods {

  String readLn();

  int readInt();


  void print(String line);

  void printf(String line, int a);

  default void printLn(String line) {
    print(line);
    printLine();
  }

  default void printLine() {
    print("\n");
  }

  void close();

  boolean hasNextInt();

  String readLnNext();

}
