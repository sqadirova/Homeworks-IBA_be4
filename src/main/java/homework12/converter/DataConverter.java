package homework12.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DataConverter {

    private static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public static String formatToString(long millis) {
        return formatDate.format(millis);
    }

    public static long stringToMillis(String string) {
        try {
            return formatDate.parse(string).toInstant().toEpochMilli();  //.getTime();
        } catch (ParseException ex) {
//            throw new ParseException("Incorrect input. enter date in format: dd/MM/yyyy", 0);
            System.out.println("Incorrect input. enter date in format: dd/MM/yyyy");
            return -1;
        }
    }

}

