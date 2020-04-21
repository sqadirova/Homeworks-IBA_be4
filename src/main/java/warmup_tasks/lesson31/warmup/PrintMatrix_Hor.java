package warmup_tasks.lesson31.warmup;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintMatrix_Hor {

    public static String dataOrdered(int R, int C, int[][] m) {
        return IntStream.range(0, R*C).map(idx -> {
            int col =idx / R;
            int shift = idx - col * R;
            int row = (col&1)==0 ? shift : R-1-shift;
            return m[row][C-1-col];
        })
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        int[][]a =
                {
                        {  1,  2,  3 },
                        {  5,  6,  7 },
                        {  9, 10, 11 },
                        { 13, 14, 15 },
                        { 17, 18, 19 },
                        { 21, 22, 23 },
                };
        System.out.println(dataOrdered(a.length, a[0].length, a));
//        System.out.println(dataOrdered2(a.length, a[0].length, a));
    }
}
