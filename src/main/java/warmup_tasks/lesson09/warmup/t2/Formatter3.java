package warmup_tasks.lesson09.warmup.t2;

public class Formatter3 extends Formatter0 {
    @Override
    public void print(String value) {
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
        System.out.println(sb.toString());
    }
}
