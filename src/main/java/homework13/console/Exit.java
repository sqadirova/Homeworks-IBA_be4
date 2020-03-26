package homework13.console;

public class Exit implements Command {
    @Override
    public int OptNumber() {
        return 10;
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public void execution() {
        fc.saveDataToFile();
        System.out.println("Bye!");
    }
}
