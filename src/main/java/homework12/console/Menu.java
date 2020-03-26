package homework12.console;

import homework12.io.ConsoleMethods;
import homework12.io.ImplConsoleMethods;

import java.util.Scanner;

public class Menu {

    public static StringBuilder menu= new StringBuilder();
    final static String dashes = new String(new char[30]).replace("\0", "-");
    public static ConsoleMethods console = new ImplConsoleMethods(new Scanner(System.in));

    static {
        generateMenu();
    }

    public static void generateMenu(){
        menu.append(dashes);
        menu.append("\nFAMILY APPLICATION\n");
//        menu.append(DASHES);
        menu.append("\n1. Fill with test data.\n");
        menu.append("2. Display families greater than.\n");
        menu.append("3. Display families less than.\n");
        menu.append("4. Count families with member number.\n");
        menu.append("5. Create new family.\n");
        menu.append("6. Delete family by index.\n");
        menu.append("7. Edit family by index.\n");
        menu.append("8. Remove children older than age.\n");
        menu.append("9. Display all families.\n");
        menu.append("10. Exit.\n");
    }


    public static void printMenu(){

        console.printLn(menu.toString());

    }


}
