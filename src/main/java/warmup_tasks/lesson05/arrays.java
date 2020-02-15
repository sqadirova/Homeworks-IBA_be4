package warmup_tasks.lesson05;

import java.util.Arrays;

public class arrays {

   /* public static int[] fill(int[] odd, int[] even, int[] combine) {
        int MAX = 10;

        //fill odd
        for (int i = 0; i < odd.length; i++) {
            int rd_num = (int) (Math.random() * (MAX + 1));
            if (!(rd_num % 2 == 0)) {
                odd[i] = rd_num;
            }
        }
        //fill even
        for (int j = 0; j < even.length; j++) {
            int rd_num = (int) (Math.random() * (MAX + 1));
            if (rd_num % 2 == 0) {
                even[j] = rd_num;
            }
        }
        return combine;
    }*/
   public static void fill(int[] odd, int[] even) {
       int SIZE = 10;

       //fill odd and even arrays
       for (int i = 0; i < odd.length; i++) {
           even[i]=(int) (Math.random() * SIZE)*2;
           odd[i]=(int) (Math.random() * SIZE)*2+1;
       }

   }

    public static void main(String[] args) {

        int SIZE = 10;
        //declare
        int[] odd = new int[SIZE];     //tek
        int[] even = new int[SIZE];    //cut
        int[] combine = new int[2 * SIZE];

        fill(odd, even);

        /*odd={1,2,3,4,5,6,7,8,9,10}
        even={10,9,8,7,6,5,4,3,2,1}
        combine={1,10,2,9,3,8,4,7,5,6,6,5,7,4,8,3,9,2,10,1}

        comb-0=odd-0
        comb-1=even-0
        comb-2=odd-1
        comb-3=even-1
        comb-4=odd2
        comb-5=even-2*/
        /*
        int j=0;
        for (int k = 0; k <SIZE ; k++) {
                combine[j]=odd[k];
                j++;
                combine[j]=even[k];
                j++;
        }*/

        for (int k = 0; k < SIZE; k++) {
            combine[k * 2] = odd[k];
            combine[k * 2 + 1] = even[k];
        }
        //print combine
        /*    for(int m = 0; m < combine.length; m++) {
            System.out.print(combine[m]+"\t");
        }*/
        System.out.printf("Odds: %s\n", Arrays.toString(odd));
        System.out.printf("Evens: %s\n", Arrays.toString(even));
        System.out.printf("Combined: %s\n", Arrays.toString(combine));
    }

}

