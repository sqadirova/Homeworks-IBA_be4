package warmup_tasks.lesson32;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintDiagonal {
  static class Track{
    int row=0;
    int col=0;
    int dir=0;
  }

  private static String traverse(int R, int C, int[][] a) {
//    Track t=new Track();
//    return IntStream.range(0,R*C).map(n->{
//      int val=a[t.row][t.col];
//
//    }).mapToObj(String::valueOf)
//            .collect(Collectors.joining(""));
    return null;
  }

  public static void main(String[] args) {
    int[][]a = {
        {  1,  2,  3,  4, },
        {  5,  6,  7,  8, },
        {  9, 10, 11, 12, },
        { 13, 14, 15, 16, },
        { 17, 18, 19, 20, },
        { 21, 22, 23, 24, },
        { 25, 26, 27, 28, },
    };
    System.out.println(traverse(a.length, a[0].length, a));

  }

}
