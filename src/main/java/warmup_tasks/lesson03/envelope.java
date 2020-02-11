package warmup_tasks.lesson03;

import java.util.Scanner;

public class envelope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the width:");
        final int width=in.nextInt();
        System.out.print("Please, enter the height:");
        final int height=in.nextInt();
        double tan=((double) width)/height;
        //rectangle
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=width; j++) {
                if (i==1||i==height||j==1||j==width||j==(int)(i*tan)||j==(width-(int)(i*tan))){
                    System.out.print("*");}
                else {System.out.print(" ");}
        }
            System.out.println();

        }

    }
}
