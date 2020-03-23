package warmup_tasks.lesson22recurs;

public class sumIntegerNum {

    static int sum_to(int n){
        if(n==0){
            return 0;
        }else{
            return n+sum_to(n-1);
        }
    }

    public static void main(String[] args) {
        int s=sum_to(10);
        System.out.println(s);
    }

}
