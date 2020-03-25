package homework12.console;

public class DisplayAllFamilies implements Command {
    @Override
    public int OptNumber() {
        return 9;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
        fc.displayAllFamilies();

    }
}
