package warmup_tasks.lesson22recurs;

public class factorial {
    static int factorial(int n) {
        if (n >=1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
