package warmup_tasks.lesson10;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void getOccurrences(String origin){
        HashMap<Character,Integer> charMap=new HashMap<Character,Integer>();
        char[] arrayStr = origin.toCharArray();
        for (char c:arrayStr) {
            if (charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else {
                charMap.put(c,1);
            }
        }
        for (Map.Entry entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        String str="Hello worldd";
        getOccurrences(str);
    }
}
