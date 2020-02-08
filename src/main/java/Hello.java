import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name=in.next();
        System.out.printf("Hello, %s!\n",name);
        System.out.printf("Nice to meet you, %s!\n ",name);
        System.out.println("Bye!");

    }
}
