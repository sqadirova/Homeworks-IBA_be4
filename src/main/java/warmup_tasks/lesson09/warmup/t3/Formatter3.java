package warmup_tasks.lesson09.warmup.t3;

import java.util.Optional;

public class Formatter3 {

    public void print(String word) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < word.length()+6; i++) {
            sb.append("*");
        }
        sb.append("\n");
        sb.append(String.format("*  %s  *",word));
        sb.append("\n");
        for (int i = 0; i < word.length()+6; i++) {
            sb.append("*");
        }
        System.out.println(sb.toString());
    }

    public Formatter3(String value) {
        print(value);
    }  //?


}
