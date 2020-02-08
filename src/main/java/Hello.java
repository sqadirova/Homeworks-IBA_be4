import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name=in.next();
        System.out.println("Hello, "+name+"!");
        System.out.println("Nice to meet you, "+name+"!");
        System.out.println("Bye!");

        System.out.println("Test");
    }
}
