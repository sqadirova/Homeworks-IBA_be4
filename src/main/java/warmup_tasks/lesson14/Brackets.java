package warmup_tasks.lesson14;

public class Brackets {

  public int calc(String origin) {
    int max=0;
    int count=0;

    for (int i = 0; i < origin.length(); i++) {
      if (origin.charAt(i)=='('){
        count++;
        max=Math.max(max,count);
        //1
//        if (count>max){
//          max=count;
//        }
        //2
       // int MAX=count>max?max=count:count;


      }else if (origin.charAt(i)==')'){
        count--;
        //1
//        if (count>0) count--;
//        else return -1;
        //2
       // int result1 = count > 0 ? count-- : -1;
      }
    }
    return max;

  }
}
