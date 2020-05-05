package web_homework_cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class History {
   private HashMap<String, String> log;

    public void addToHistory(HttpServletRequest req,String operation){
       log=new HashMap<>(); //history of cookies
        Cookie[] cookies = req.getCookies();
        for (Cookie c:cookies) {
            String username = c.getName();
            if (username.equals("aaa")){
                log.put(username,operation);
            }
        }
    }

    public String represent(){
        return log.toString();
    }
}
