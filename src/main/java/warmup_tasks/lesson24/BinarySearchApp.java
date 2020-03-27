package warmup_tasks.lesson24;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchApp {
  static int[] data = new Random().ints(0, 10000).limit(1000).toArray();
  static int[] sorted = data.clone();

  static boolean binarySearch(int[] array, int number) {
    int start = 0;
    int end = array.length - 1;
    int count = 0;

    while (start <= end) {
      count++;
      int mid = (start + end) / 2;
      if (array[mid] == number) {
        represent(count,array[mid],mid);
        return true;
      } else if (array[mid] > number) {
        end = mid - 1;
      } else if (array[mid] < number) {
        start = mid + 1;
      }
    }

    return false;
  }

  static void represent(int count,int number,int index){
    System.out.printf("Count of if: %d\n", count);
    System.out.printf("The searched number: %d \nindex of that number: %d\n",number,index);
  }


  public static void main(String[] args) {
    Arrays.sort(sorted);
//    System.out.println(Arrays.toString(data));
    System.out.println(Arrays.toString(sorted));
    int rnd_idx = (int) (Math.random() * 1000);
    int rnd = sorted[rnd_idx];
    boolean result = binarySearch(sorted, rnd);
    System.out.println(result);
  }


}
