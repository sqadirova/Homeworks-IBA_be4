package homework13.console;

import homework13.io.ConsoleMethods;
import homework13.io.ImplConsoleMethods;

import java.util.*;

public class ConsoleApp {
    List<Command> commands=new ArrayList<>();
    Optional<Command> command;
    //I dont understand why its red but it work =)   ???
    ConsoleMethods console = new ImplConsoleMethods(new Scanner(System.in));
    Menu menu = new Menu();
    boolean isExit = false;
    int number = 0;

    public ConsoleApp() {
        commands = Commands.all();
    }

    public void start() {
        while (!isExit) {
            menu.printMenu();

            console.printLn("Enter option number:");
            try {
                while (!console.hasNextInt()) {
                    String input = console.readLnNext();
                    console.print("Enter option in number format:\n");
                }
                number = console.readInt();
                command = commands.stream().filter(x -> x.OptNumber() == number).findFirst();
                command.ifPresent(Command::execution);
                isExit = command.get().isExit();
            } catch (NoSuchElementException ex) {
                console.printLn("Please, enter valid number!!!");
            }

        }

    }

}
