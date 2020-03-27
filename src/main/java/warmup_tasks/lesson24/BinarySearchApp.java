package warmup_tasks.lesson24;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchApp {
  static int[] data = new Random().ints(0, 10000).limit(1000).toArray();
  static int[] sorted = data.clone();

  // return number of `if` statements
  static int find_conventional(int[] origin, int number) {
    throw new RuntimeException();
  }

  // return number of `if` statements
  static int find_binary(int[] origin, int number) {
    throw new RuntimeException();
  }

  static int binarySearch(int[] array,int number) {
    int start = 0;
    int end = array.length - 1;
    int count=0;

    while (start <= end) {
      int mid = (start + end) / 2;
      count++;
      if (array[mid] == number) {
        System.out.printf("Count of if: %d\n",count);
        return  mid;
      } else if (array[mid] > number) {
        end = mid - 1;
      } else if (array[mid] < number) {
        start = mid + 1;
      }
    }

    return -1;
  }



  public static void main(String[] args) {
    Arrays.sort(sorted);
//    System.out.println(Arrays.toString(data));
    System.out.println(Arrays.toString(sorted));
//    int rnd = (int) (Math.random()*10000);
//    int count1 = find_conventional(data, rnd);
//    int count2 = find_binary(sorted, rnd);
    int index = binarySearch(sorted, sorted[64]);
    System.out.println(index);
  }




}
