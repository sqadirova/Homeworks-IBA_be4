package homework12.console;


import homework12.Human.Human;

public class EditFamilyByIndex extends CreateHumans implements Command {

    Human child;

    @Override
    public int OptNumber() {
        return 7;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
//        console.printLn("1.Give birth to baby\n2.Adopt child\n3.Return to main menu");
        console.printLn("1.Give birth to baby\n");
        console.printLn("2.Adopt child\n");
        console.printLn("3.Return to main menu\n");
        console.printLine();
        console.print("Enter option number:");

        int opt = console.readInt();
        switch (opt) {
            case 1:
                console.print("Enter family index: ");
                int index = console.readInt();
                console.readLn();
                console.printLn("Name for boy");
                String name = console.readLn();
                console.printLn("Name for girl ");
                String name2 = console.readLn();
                fc.bornChild(fc.getFamilyById(index), name, name2);
                break;

            case 2:
                console.print("Enter family index: ");
                int index2 = console.readInt();
                console.readLn();
                child = createHuman();
//                console.printLn("Gender of the kid (boy or girl) :");
//
//                String gender=console.readLn();
//
//                if(gender.trim().equalsIgnoreCase("girl")){
//                   kid=createWoman();
//                }
//                if(gender.trim().equalsIgnoreCase("boy")){
//                    kid=createMan();
//                }
//                else{
//
////                }
                fc.adoptChild(fc.getFamilyById(index2), child);
                break;

            case 3:
                console.printLn("Returning to main menu");
                break;
        }

    }
}
