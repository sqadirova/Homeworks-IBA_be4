package warmup_tasks.lesson05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class shiftNumbers {

    public static int[] generate(int size) {
        return IntStream.range(0, size)
                .map(n -> (int)(Math.random()*200-100))
                .toArray();
    }

    public static int[] rotateRight(int[] origin) {
        int cnt = 0;
        int[] pos = new int[origin.length];
        //positions of positive elements from array
        for (int i = 0; i < origin.length; i++) {
            if (origin[i] > 0) {
                pos[cnt++] = i;
            }
        }
        if (cnt < 2) return origin;
        int[] rotated = origin.clone();
        //
        for (int i = 0; i < cnt - 1; i++) {
            int curr_pos = pos[i];
            int next_pos = pos[i + 1];
            rotated[next_pos] = origin[curr_pos];
        }
        rotated[pos[0]] = origin[pos[cnt - 1]];
        //
        return rotated;

    }

    public static void main(String[] args) {
        int[] origin = generate(10);
        int[]rotated= rotateRight(origin);

        System.out.printf("Before shifting: %s\n", Arrays.toString(origin));
        System.out.printf("Shifted array: %s\n", Arrays.toString(rotated));


    }
}

