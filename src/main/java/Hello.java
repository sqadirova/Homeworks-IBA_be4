import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Hello, what is your name?");
//        String name=in.next();
//        System.out.printf("Hello, %s!\n",name);
//
//        System.out.printf("How old are you, %s?\n",name);
//        int age=in.nextInt();
//        if(age<18){
//            System.out.println("You can go to the cinema!");
//        }
//        else {
//            System.out.println("You can go to night club!");
//        }
//
//        System.out.printf("Nice to meet you, %s!\n ",name);
//        System.out.println("Bye!");

        //= = = =  = = = =  =
        int max=10;
//        int r=(int)(Math.random()*(max+1));   //[0..10]
        int[] array=new int[10];
        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)(Math.random()*(max+1));
            System.out.println(array[i]);
        }

    }
}
