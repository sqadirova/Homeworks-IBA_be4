package homework12.console;

import homework12.controller.FamilyController;
import homework12.io.ImplConsoleMethods;

import java.util.Scanner;

public interface Command {
    FamilyController fc=new FamilyController();
    ImplConsoleMethods console=new ImplConsoleMethods(new Scanner(System.in));

    public int OptNumber();
    public boolean isExit();
    public void execution();

}
