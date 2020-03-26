package homework13.console;

public class FamiliesLessThan implements Command {
    @Override
    public int OptNumber() {
        return 3;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
        console.print("Families with members less than:");
        int count=console.readInt();
        System.out.println(fc.getFamiliesLessThan(count));

    }
}
