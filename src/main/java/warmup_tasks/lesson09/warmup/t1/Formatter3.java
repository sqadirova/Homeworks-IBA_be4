package warmup_tasks.lesson09.warmup.t1;

public class Formatter3 extends Formatter0 {
    @Override
    public String formatLetter(String value) {
         StringBuilder sb=new StringBuilder();
        for (int i = 0; i < value.length()+6; i++) {
            sb.append("*");
        }
        sb.append("\n");
        sb.append(String.format("*  %s  *",value));
        sb.append("\n");
        for (int i = 0; i < value.length()+6; i++) {
            sb.append("*");
        }

        return sb.toString();
    }
}
