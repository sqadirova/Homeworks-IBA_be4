package warmup_tasks.lesson02;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    //warmup1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = in.next();
        System.out.printf("Hello, %s!\n", name);

        System.out.printf("How old are you, %s?\n", name);
        int age = in.nextInt();
        if (age < 18) {
            System.out.println("You can go to the cinema!");
        } else {
            System.out.println("You can go to night club!");
        }

        System.out.printf("Nice to meet you, %s!\n ", name);
        System.out.println("Bye!");


    }

    //warmup2
    public static void main2(String[] args) {
        int max=10;
        //        int r=(int)(Math.random()*(max+1));   //[0..10]
        int[] array=new int[10];
        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)(Math.random()*(max+1));
            System.out.println(array[i]);
        }


    }

    //warmup3
    public static void main3(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                System.out.println("fizz");
            }else if (a[i]%3==0){
                System.out.println("buzz");
            }else if (a[i]%2==0 && a[i]%3==0 ){
                System.out.println("fizz buzz");
            }
            else {
                System.out.println(a[i]);
            }
        }

    }

    //warmup4
    public static void main4(String[] args) {
     //  float r=(int)(Math.random()*200-100);
       int[] array=new int[30];

      // int[] pos_odd=new int [30];
       // int[] neg_odd=new int [30];
       // int[] pos_even=new int [30];
        //int[] neg_even=new int [30];


        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)(Math.random()*200-100);
            if (array[i]>0 && array[i]%2==0){
                //pos_odd[i]=array[i];
                System.out.println("PO: "+array[i]);
            }
            else if (array[i]<0 && array[i]%2==0)
            {
                //neg_odd[i]=array[i];
                System.out.println("NO: "+array[i]);
            }
            else if (array[i]>0 && array[i]%2!=0){
               // pos_even[i]=array[i];
                System.out.println("PE: "+array[i]);
            }
            else if (array[i]<0 && array[i]%2!=0){
                //neg_even[i]=array[i];
                System.out.println("NE: "+array[i]);
            }
        }
       // for (int i = 0; i <array.length ; i++) {
         //   System.out.print("PO: "+pos_odd[i]);
         //   System.out.print("NO: "+neg_odd[i]);
         //   System.out.print("PE: "+pos_even[i]);
          //  System.out.println("NE: "+neg_even[i]);
       // }

    }

//    public static void main5(String[] args) {
//        // 1.random data generaton
//        final int LEN=30;
//        final int[] origin=new int[LEN];
//        for (int i = 0; i < origin.length; i++) {
//            origin[i]=(int)(Math.random()*200-100);
//        }
//        //counting
//        int count_pe=0;
//        int count_po=0;
//        int count_ne=0;
//        int count_no=0;
//
//        for (int i = 0; i < origin.length; i++) {
//            if (origin[i]<0) {
//                if (origin[i] % 2 == 0) {
//                    count_ne++;
//                } else {
//                    count_no++;
//                }
//            }
//                else if (origin[i] % 2 == 0) {
//                    count_pe++;
//                } else {
//                    count_po++;
//                }
//
//        }
//
//        //..
//        //10. origin data printing
//        System.out.println(Arrays.toString(origin));
//
//    }
}
