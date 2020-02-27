package warmup_tasks.lesson09.warmup.t3;

public class Formatter1 {
   private String value;

   public Formatter1(String value){
       this.value=value;
   }

    @Override
    public String toString() {
        return value.toLowerCase();
    }

    //wrong way
//    public Formatter1(String value) {
//        System.out.println(value.toLowerCase());
//    }
}
