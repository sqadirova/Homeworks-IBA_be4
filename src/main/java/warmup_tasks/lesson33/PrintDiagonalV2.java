//package warmup_tasks.lesson33;
//
//import java.util.LinkedList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//
//public class PrintDiagonalV2 {
//
//
//  private static String traverse(int R, int C, int[][] a) {
//
//    class Track {
//      final int r;
//      final int c;
//      final int dir;
//
//      Track() {
//        this(0,0,0);
//      }
//
//      Track(int r, int c, int dir) {
//        this.r = r;
//        this.c = c;
//        this.dir = dir;
//      }
//
//    }
//
//    Track t = new Track();
//
//    final List<Integer> result = new LinkedList<>();
////    result.add(45);
//    result.add(t.c);
//    result.add(t.r);
//    result.add(t.dir);
//
//    return IntStream.range(0, R*C).map(n -> {
//      int val = a[t.r][t.c];
//      int nc=result.get(0);
//      switch (t.dir) {
//        case 0: t.c++; t.dir=1; break;
//        case 1:
//          if      (t.r == R-1) { t.c++; t.dir=2; }
//          else if (t.c == 0  ) { t.r++; t.dir=2; }
//          else                 { t.r++; t.c--;   }
//          break;
//        case 2:
//          if      (t.c == C-1) { t.r++; t.dir=1; }
//          else if (t.r == 0)   { t.c++; t.dir=1; }
//          else                 { t.r--; t.c++;   }
//      }
//      return val;
//    });
//
//    //////////////////////////////////////////
//    return result.stream()
//        .map(String::valueOf)
//        .collect(Collectors.joining(" "));
//  }
//
//  public static void main(String[] args) {
//    int[][]a = {
//        {  1,  2,  3,  4, },
//        {  5,  6,  7,  8, },
//        {  9, 10, 11, 12, },
//        { 13, 14, 15, 16, },
//        { 17, 18, 19, 20, },
//        { 21, 22, 23, 24, },
//        { 25, 26, 27, 28, },
//    };
//    System.out.println("1 2 5 9 6 3 4 7 10 13 17 14 11 8 12 15 18 21 25 22 19 16 20 23 26 27 24 28");
//    System.out.println(traverse(a.length, a[0].length, a));
//  }
//
//}
