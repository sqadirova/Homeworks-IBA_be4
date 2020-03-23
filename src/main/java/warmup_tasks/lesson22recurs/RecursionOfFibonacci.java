package warmup_tasks.lesson22recurs;

public class RecursionOfFibonacci {
    static int fibo(int n){
        if(n==1 || n==2){
            return 1;
        }else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {

        System.out.printf("Fibo number in 8th: %d\n",fibo(8));

        System.out.println("fibo sequence:");
        for (int i= 1; i <= 8; i++) {
            System.out.print(fibo(i)+"\t");
        }

    }
}
