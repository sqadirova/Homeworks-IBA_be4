package homework11;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataConverter {
   private static SimpleDateFormat formatDate=new SimpleDateFormat("dd/MM/yyyy");

    public static String formatToString(long millis) {
        return formatDate.format(millis);
    }

    public static long stringToMillis(String string) throws ParseException {
        try {
            return formatDate.parse(string).toInstant().toEpochMilli();  //.getTime();
        } catch (ParseException ex) {
            throw new ParseException("Incorrect input. enter date in format: dd/MM/yyyy", 0);
        }
    }



}
