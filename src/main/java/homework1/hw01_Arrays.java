package homework1;

import java.util.Random;
import java.util.Scanner;

public class hw01_Arrays {

//    private static int[] addNumberToArray(int number,int len)
//    {
//        int[] input_numbers=new int[len];
//
//
//        return input_numbers;
//    }

    public static void main(String[] args) {
       // int[] yournumber=addNumberToArray();
        int len_array=0;
        //1. Random number
        int max=100;
        int rd_number=(int)(Math.random()*(max+1));    //[0,100]
//        System.out.printf("Random number: %d\n",rd_number);



        //2.Enter the name
        Scanner in=new Scanner(System.in);
        System.out.println("What is your name?");
        String name= in.nextLine();

        //3.Compare the number
        System.out.println("Let the game begin!");
        while(true){
            System.out.println("Please, enter the number:");
            int number=in.nextInt();
            len_array++;

            if (number<rd_number){
                System.out.println("Your number is too small. Please, try again.");

            }
            else if (number>rd_number)
            {
                System.out.println("Your number is too big. Please, try again.");
            }else {
                System.out.printf("Congratulations, %s\n", name);
                int[] guessnumbers=new int[len_array];
                for (int i = 0; i < guessnumbers.length; i++) {
                    guessnumbers[i]=number;
                    System.out.print(guessnumbers[i]+"\t");
                }
                break;
//                int[] guessnumbers=addNumberToArray(number,len_array);
//                for (int i = 0; i < guessnumbers.length; i++) {
//                    guessnumbers[i]=number;
//                    System.out.print(guessnumbers[i]+"\t");
//                }


            }

        }



    }
}
