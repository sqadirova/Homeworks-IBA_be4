package homework13.console;

import homework13.entity.human.Human;

public class CreateNewFamily extends CreateHumans implements Command {
    @Override
    public int OptNumber() {
        return 5;
    }

    @Override
    public boolean isExit() {
        return false;
    }


    @Override
    public void execution() {
        console.printLn("Enter information for Mother:");
        Human mother=createHuman();
        console.printLn("Enter information for Father:");
        Human father=createHuman();
        fc.createNewFamily(mother,father);

    }
}
