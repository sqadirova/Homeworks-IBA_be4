package warmup_tasks.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class task2 {
//    public static void getCount(String origin){
//        char[] arrayChar=origin.toCharArray();
//        for (char ch:arrayChar) {
//            System.out.printf("%c : <%d>\n",ch,origin.indexOf(ch,0));
//        }
//    }

    public static void main(String[] args) {
        String str="Hello Worldd";
        char[] arrayCh=str.toCharArray();

        ArrayList<Character> listCh=new ArrayList<>();
        for (char ch:arrayCh) {
            listCh.add(ch);
        }
        for (int i = 0; i < arrayCh.length; i++) {
            System.out.println(listCh.get(i)+": "+listCh.indexOf(listCh.get(i)));
        }



    }
}
