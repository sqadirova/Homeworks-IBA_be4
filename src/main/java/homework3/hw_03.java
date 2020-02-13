package homework3;

import java.util.Scanner;

public class hw_03 {

    public static void getToDoListofDay(String[][] array, String _input) {
        switch (_input) {
            case "monday":
                System.out.println(array[0][1]);
                break;
            case "tuesday":
                System.out.println(array[1][1]);
                break;
            case "wednesday":
                System.out.println(array[2][1]);
                break;
            case "thursday":
                System.out.println(array[3][1]);
                break;
            case "friday":
                System.out.println(array[4][1]);
                break;
            case "saturday":
                System.out.println(array[5][1]);
                break;
            case "sunday":
                System.out.println(array[6][1]);
                break;
            default:
                System.out.println("Sorry, I don't understand you, please try again.");
        }
    }

    public static void main(String[] args) {

        String[][] schedule = new String[7][2];

        schedule[0][0] = "monday";
        schedule[0][1] = "do home work; do sport";
        schedule[1][0] = "tuesday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "wednesday";
        schedule[2][1] = "do home work; do tests";
        schedule[3][0] = "thursday";
        schedule[3][1] = "go to courses; do sport";
        schedule[4][0] = "friday";
        schedule[4][1] = "do home work; meeting with friends";
        schedule[5][0] = "saturday";
        schedule[5][1] = "go to courses";
        schedule[6][0] = "sunday";
        schedule[6][1] = "do home work; do sport";

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = in.nextLine().toLowerCase().trim();
            if (input.equals("exit")) break;
            getToDoListofDay(schedule, input);

        }
    }
}







//        while (true) {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Please, input the day of the week:");
//            String day = in.nextLine();
//            if (day.equals("exit")) break;
//            switch (day) {
//                case "Monday":
//                    System.out.println(schedule[0][1]);
//                    break;
//                case "Tuesday":
//                    System.out.println(schedule[1][1]);
//                    break;
//                case "Wednesday":
//                    System.out.println(schedule[2][1]);
//                    break;
//                case "Thursday":
//                    System.out.println(schedule[3][1]);
//                    break;
//                case "Friday":
//                    System.out.println(schedule[4][1]);
//                    break;
//                case "Saturday":
//                    System.out.println(schedule[5][1]);
//                    break;
//                case "Sunday":
//                    System.out.println(schedule[6][1]);
//                    break;
//                default:
//                    System.out.println("Sorry, I don't understand you, please try again.");
//            }
//        }

//             0            1
//        0   monday      do homework
//        1   thuesday     wathc film
//        2   wednesday     dfdghfh
//        3
//        4
//        5
//        6





