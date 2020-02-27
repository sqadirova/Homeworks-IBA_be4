package warmup_tasks.lesson09.warmup.t3;

public class Formatter2 {
    private String value;

    public Formatter2(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return value.toUpperCase();
    }
}
