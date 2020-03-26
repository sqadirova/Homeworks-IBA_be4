package homework12.console;

import homework12.entity.human.Human;
import homework12.entity.human.Man;
import homework12.entity.human.Woman;
import homework12.io.ConsoleMethods;
import homework12.io.ImplConsoleMethods;

import java.util.Scanner;

public class CreateHumans {
    
    ConsoleMethods cons=new ImplConsoleMethods(new Scanner(System.in));
//    long epoch;
//
//    public long birthDatetoLong(String date){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//
//        try{
//            LocalDate localDate = LocalDate.parse(date, formatter);
//            epoch = 1000*localDate.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
//
//        }
//        catch (DateTimeParseException e) {
//            console.printLn("Wrong date format! It will be given default birthDate!");
//        }
//
//        return epoch;
//
//    }

    public Man createMan() {
        cons.readLn();
        cons.print("Name for the boy:");
        String name= cons.readLn();
        cons.print("Last Name:");
        String surname= cons.readLn();
        cons.print("Enter birthDate in dd/MM/yyyy format:");
        String birthDate=cons.readLn();
//        con.print("IQ:");
//        int iq=con.readInt();
        cons.printLine();
        return new Man(name,surname,birthDate);

    }



    public Woman createWoman() {
        cons.readLn();
        cons.print("Name for the girl:");
        String name= cons.readLn();
        cons.print("Last Name:");
        String surname= cons.readLn();
        cons.print("Enter birthDate in dd/MM/yyyy format:");
        String birthDate=cons.readLn();
//        console.print("IQ:");
//        int iq=console.readInt();
        cons.printLine();
        return new Woman(name,surname,birthDate);

    }


    public Human createHuman() {
        cons.readLn();
        cons.print("First Name:");
        String name= cons.readLn();
        cons.print("Last Name:");
        String surname= cons.readLn();
        cons.print("Enter birthDate in dd/MM/yyyy format:");
        String birthDate=cons.readLn();
//        console.print("IQ:");
//        int iq=console.readInt();
        cons.printLine();
        return new Human(name,surname,birthDate);

    }
}
