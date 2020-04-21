package warmup_tasks.lesson34.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiagonalDifferenceV1 {

    private static int differenceOfDiagonals(List<List<Integer>> data) {
        int sumOfDiagonal1 = IntStream.range(0, data.size()).map(i -> data.get(i).get(i)).sum();
        int sumOfDiagonal2 = IntStream.range(0, data.size()).map(i -> data.get(i).get(data.size() - 1 - i)).sum();
        return Math.abs(sumOfDiagonal1-sumOfDiagonal2);
    }

    public static void main(String[] args) {
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1, 2, 13),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 10, 12)
        );

        int result=differenceOfDiagonals(data);
        System.out.println(result);
    }

}
