package warmup_tasks.lesson03;

import java.util.Scanner;

public class envelope2 {
    private static boolean isShouldBeFilled(int i, int j, int width, int height, double tan) {
        return i==1||i==height||j==1||j==width||j==(int)(i*tan)||j==(width-(int)(i*tan));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the width:");
        final int width=in.nextInt();
        System.out.print("Please, enter the height:");
        final int height=in.nextInt();
        double tan=((double) width)/height;
       StringBuilder envelope=new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=width; j++) {
                if (isShouldBeFilled(i, j, width, height, tan)){
                    envelope.append("*");}
                else {envelope.append(" ");}
            }
            envelope.append("\n");
        }
        System.out.println(envelope);
    }
}
