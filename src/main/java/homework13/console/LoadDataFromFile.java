package homework13.console;

public class LoadDataFromFile implements Command {
    @Override
    public int OptNumber() {
        return 1;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
        fc.loadDataFromFile();
        console.printLn("Loaded data to database...");
    }

}
