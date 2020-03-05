package warmup_tasks.lesson13;

import java.util.Arrays;

public class StringCheckRotated {

  public boolean check(String origin, String rotated){
    return (origin.length()==rotated.length())
            && ((origin+origin).contains(rotated));

  }

}
