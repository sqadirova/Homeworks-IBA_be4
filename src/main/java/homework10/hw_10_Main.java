package homework10;

import homework10.Human.Human;
import homework10.Human.Man;

import java.text.ParseException;

public class hw_10_Main {
    public static void main(String[] args) throws ParseException {
        Human human=new Human("Siddiqa","Qadirova","12/02/1997");
        System.out.println(human);
        System.out.println(human.describeAge());

        Human man=new Man("Emin","Aliyev","12/01/1989");
        System.out.println(man);
        System.out.println(man.describeAge());

        Human adoptedChild=new Human("Lale","Hesenova","16/05/2000",75);
        System.out.println(adoptedChild);
        System.out.println(adoptedChild.describeAge());

    }
}
