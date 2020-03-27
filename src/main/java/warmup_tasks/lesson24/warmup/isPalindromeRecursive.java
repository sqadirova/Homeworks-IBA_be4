package warmup_tasks.lesson24.warmup;

public class isPalindromeRecursive {
    boolean doCheck(String s,int l,int r){
        if (l>=r) return true;
        if (s.charAt(l)!=s.charAt(r)) return false;
        return doCheck(s,l+1,r-1);
    }

    boolean check(int n){
        String s=Integer.toString(n);
        return doCheck(s,0,s.length()-1);
    }
}
