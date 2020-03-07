package warmup_tasks.lesson14;

public class Brackets {

  public int calc(String origin) {
    int max=0;
    int count=0;

    for (int i = 0; i < origin.length(); i++) {
      if (origin.charAt(i)=='('){
        count++;
        if (count>max){
          max=count;
        }
      }else if (origin.charAt(i)==')'){
        if (count>0) count--;
        else return -1;
      }
    }
    return max;
  }

}
