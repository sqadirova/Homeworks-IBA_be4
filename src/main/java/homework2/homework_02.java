package homework2;

import java.text.Format;
import java.util.Scanner;

public class homework_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String[][] arr=new String[5][5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <5; j++) {
//                //System.out.print(arr[i][j] + "\t");
////                if (i==0 && j==0) {
////                    for (int k = 0; k <= 5; k++) {
////                        System.out.print(arr[0][j]=k +" | ");
////
////                    }
////                    System.out.println();
////                }
//
//              System.out.print("- |");
//            }
//            System.out.println();
//
//        }

        String[][] arr = new String[5][5];

        //randomly set target
        int rd_i = (int) (Math.random() * (5 + 1));
        int rd_j = (int) (Math.random() * (5 + 1));

        System.out.println(rd_i + "," + rd_j);
        //set target and mark like "x"
        //arr[rd_i][rd_j]="x";

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                arr[x][y] = "-";
            }
        }

        int i;
        int j;


        System.out.println("All set. Get ready to rumble!");
        while (true) {
            System.out.println("Enter the line for fire:");
            i = in.nextInt();
            if (!(i >= 0 && i < 5)) {
                System.out.println("Enter the number again:");
                i = in.nextInt();
            }
            System.out.println("Enter the bar for fire:");
            j = in.nextInt();
            if (!(j >=0 && j < 5)) {
                System.out.println("Enter the number again:");
                j = in.nextInt();
            }


            //check the number and mark
            if (i == rd_i && j == rd_j) {
                System.out.println("You have won!");
                arr[rd_i][rd_j] = "x";
                break;
            } else {
                arr[i][j] = "*";
                for (int k = 0; k < 5; k++) {
                    for (int m = 0; m < 5; m++) {
                        System.out.print(arr[k][m] + "\t");
                    }
                    System.out.println();
                }
                continue;
            }


            //Print array


        }
        for (int k = 0; k < 5; k++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(arr[k][m] + "\t");
            }
            System.out.println();
        }


    }
}

