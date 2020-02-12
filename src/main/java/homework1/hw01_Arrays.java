package homework1;

import java.util.Random;
import java.util.Scanner;

public class hw01_Arrays {

    private static void sortingNumbers(int[] arr,int len) {
        int temp = 0;
        for (int k = 0; k < len; k++) {
            for (int j = 1; j < (len - k); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {

        //1. Random number
        int max=100;
        int rd_number=(int)(Math.random()*(max+1));    //[0,100]
//        System.out.printf("Random number: %d\n",rd_number);

        //2.Enter the name
        Scanner in=new Scanner(System.in);
        System.out.println("What is your name?");
        String name= in.nextLine();

        int i=0;
        int[] arr=new int[100];
        //3.Compare the number
        System.out.println("Let the game begin!");
        while(true){
            System.out.println("Please, enter the number:");
            int number=in.nextInt();
            //Add number to array
            arr[i] = number;
            i++;      //length of array
            //Compare numbers
            if (number<rd_number){
                System.out.println("Your number is too small. Please, try again.");
            }
            else if (number>rd_number)
            {
                System.out.println("Your number is too big. Please, try again.");
            }
            else {
                System.out.printf("Congratulations, %s\n", name);

                sortingNumbers(arr,i);

                System.out.print("Your numbers: ");
                for (int j = 0; j < i; j++) {
                    System.out.print(arr[j]+",");
                }
                break;
            }
        }
    }

}
