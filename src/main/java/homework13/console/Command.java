package homework13.console;

import homework13.controller.FamilyController;
import homework13.io.ImplConsoleMethods;

import java.util.Scanner;

public interface Command {
    FamilyController fc=new FamilyController();
    ImplConsoleMethods console=new ImplConsoleMethods(new Scanner(System.in));

    public int OptNumber();
    public boolean isExit();
    public void execution();

}
